package com.task.travelport.flightAvailabilityService.model;

/**
 * Fare model class
 */
public class Fare {

    /**
     * Currency as String. Eg: EUR, USD
     */
    private final String currency;

    /**
     * Amount as {@link Double} value
     */
    private final double amount;

    /**
     * Constructor
     * @param currency Currency as String
     * @param amount Amount as Double value
     */
    public Fare(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    /**
     * Getter currency access method
     * @return Currency as String
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Getter amount access method
     * @return amount as double value
     */
    public double getAmount() {
        return amount;
    }
}
