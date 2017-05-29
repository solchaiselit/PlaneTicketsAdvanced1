package com.planetickets.validator.user;

import com.planetickets.dao.UserDao;
import com.planetickets.entity.User;
import com.planetickets.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by user on 29.05.2017.
 */

@Component
public class UserValidator implements Validator {

    @Autowired
    private UserDao userDao;


    @Override
    public void validate(Object o) throws Exception {

        User user = (User) o;

        if(user.getLastName().isEmpty()){

            throw new UserException(UserValidationMessages.EMPTY_USERNAME_FIELD);
        } else if (userDao.findByLastName(user.getLastName()) != null)
             {
                             throw new UserException(UserValidationMessages.USERNAME_ALREADY_EXIST);
        }else if(user.getFirstName().equalsIgnoreCase("vova")){
            throw new UserException(UserValidationMessages.WRONG_FIRST_NAME);
        }else if (!user.getEmail().contains("@")){

            throw new UserException(UserValidationMessages.WRONG_EMAIL);
        }else if (userDao.findByEmail(user.getEmail())!=null){
            throw new UserException((UserValidationMessages.EMPTY_EMAIL));
        }

    }
}
