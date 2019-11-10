package com.task.travelport.flightAvailabilityService.model;

import java.util.ArrayList;

/**
 * Availability model class
 */
public class Availability {

    private final ArrayList<Flight> flights;

    /**
     * Constructor
     * @param flights List of flights
     */
    public Availability(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    /**
     * Getter function
     * @return Gets the available list of flights
     */
    public ArrayList<Flight> getFlights() {
        return flights;
    }
}
