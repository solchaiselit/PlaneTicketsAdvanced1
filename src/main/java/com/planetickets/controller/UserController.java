package com.planetickets.controller;

import com.planetickets.entity.User;
import com.planetickets.service.CityService;
import com.planetickets.service.UserService;
import com.planetickets.validator.user.UserValidationMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.security.util.Password;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private CityService cityService;


    @GetMapping("/registration")
    public String registration(Model model) {

        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String user(@ModelAttribute User user, Model model) {

        try {

            userService.save(user);
        } catch (Exception e) {
            if(e.getMessage().equals(UserValidationMessages.WRONG_FIRST_NAME)){
                model.addAttribute("firstnameException",e.getMessage());
            }
            if (e.getMessage().equals(UserValidationMessages.EMPTY_USERNAME_FIELD) ||
                    e.getMessage().equals(UserValidationMessages.USERNAME_ALREADY_EXIST)) {
                model.addAttribute("usernameException", e.getMessage());
            }else if (e.getMessage().equals(UserValidationMessages.WRONG_EMAIL) ||
                    e.getMessage().equals(UserValidationMessages.EMPTY_EMAIL)){
                model.addAttribute("useremailException",e.getMessage());
            }

            return "registration";
        }


        return "redirect:/registration";

    }

    @GetMapping("/userList")
    public String city(Model model) {

        model.addAttribute("showUsers", userService.findAll());
        return "userList";
    }

    @PostMapping("/showUsers")
    public String showUser(Model model) {

        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("showUsers", userService.findAll());

//		for(User u: userService.findAll()){
//			System.out.println(u.getFirstName() + " " + u.getLastName());
//		}

        return "userList";
    }


    @GetMapping("/deleteUser/{id}")
    public String delete(@PathVariable int id) {

        userService.delete(id);

        return "redirect:/userList";

    }

    @GetMapping("/updateUser/{id}")
    public String update(@PathVariable int id, Model model) {

        User user = userService.findOne(id);

        model.addAttribute("currentUser", user);

        return "updateUser";
    }

    @PostMapping("/updateUser/{id}")
    public String update(@PathVariable int id, @RequestParam String First_name, String Last_name, String Email, String
        Password) {

        User user = userService.findOne(id);

        user.setFirstName(First_name);
        user.setLastName(Last_name);
        user.setEmail(Email);
        user.setPassword(Password);

        userService.update(user);

        return "redirect:/userList";
    }

    @GetMapping("/addUserToFlight/{id}")
    public String add() {


        return "addUserToFlight/{id}";
    }


}
