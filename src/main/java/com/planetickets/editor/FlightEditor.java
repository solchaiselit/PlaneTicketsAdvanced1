package com.planetickets.editor;

import com.planetickets.entity.City;
import com.planetickets.entity.Flight;

import java.beans.PropertyEditorSupport;

/**
 * Created by user on 27.05.2017.
 */
public class FlightEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String IdFromJSP) throws IllegalArgumentException {

        Flight flight = new Flight();

        flight.setId(Integer.parseInt(IdFromJSP));

        setValue(flight);

    }
}