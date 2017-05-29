package com.planetickets.editor;

import com.planetickets.entity.City;

import java.beans.PropertyEditorSupport;

/**
 * Created by user on 27.05.2017.
 */
public class CityEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String IdFromJSP) throws IllegalArgumentException {

        City city = new City();

        city.setId(Integer.parseInt(IdFromJSP));

        setValue(city);

    }
}
