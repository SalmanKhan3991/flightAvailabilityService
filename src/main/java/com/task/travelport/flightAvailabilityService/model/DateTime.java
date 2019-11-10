package com.task.travelport.flightAvailabilityService.model;

/**
 * Model class for formatting date and time
 */
public class DateTime {

    /**
     * Date as a String
     */
    private final String date;

    /**
     * Time as a String
     */
    private final String time;

    /**
     * Constructor
     * @param date Date as String
     * @param time Time as String
     */
    public DateTime(String date, String time) {
        this.date = date;
        this.time = time;
    }

    /**
     * Getter date access method
     * @return Gets date as String
     */
    public String getDate() {
        return date;
    }

    /**
     * Getter time access method
     * @return Gets time as String
     */
    public String getTime() {
        return time;
    }
}
