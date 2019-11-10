package com.task.travelport.flightAvailabilityService.model;

/**
 * Flight Model class
 */
public class Flight {

    /**
     * Flight operator
     */
    private final String operator;

    /**
     * Flight number
     */
    private final String flightNumber;

    /**
     * Origin airport
     */
    private final String departsFrom;

    /**
     * Destination airport
     */
    private final String arrivesAt;

    /**
     * Departure date and time
     */
    private final DateTime departsOn;

    /**
     * Arrival date and time
     */
    private final DateTime arrivesOn;

    /**
     * Prices for first, business and economy classes
     */
    private final FarePrices farePrices;

    /**
     * Constructor
     * @param operator Flight Operator
     * @param flightNumber Flight number
     * @param departsFrom Flight origin
     * @param arrivesAt Flight destination
     * @param departsOn Departure date and time
     * @param arrivesOn Arrival date and time
     * @param farePrices Prices for different classes
     */
    public Flight(String operator, String flightNumber, String departsFrom, String arrivesAt, DateTime departsOn, DateTime arrivesOn, FarePrices farePrices) {
        this.operator = operator;
        this.flightNumber = flightNumber;
        this.departsFrom = departsFrom;
        this.arrivesAt = arrivesAt;
        this.departsOn = departsOn;
        this.arrivesOn = arrivesOn;
        this.farePrices = farePrices;
    }

    /**
     * Getter operator access method
     * @return Operator as String
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Getter flightNumber access method
     * @return flightNumber as String
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Getter DepartsFrom access method
     * @return Flight origin as String
     */
    public String getDepartsFrom() {
        return departsFrom;
    }

    /**
     * Getter ArrivesAt access method
     * @return Destination as String
     */
    public String getArrivesAt() {
        return arrivesAt;
    }

    /**
     * Getter DepartsOn access method
     * @return Departure date as {@link DateTime}
     */
    public DateTime getDepartsOn() {
        return departsOn;
    }

    /**
     * Getter ArrivesOn access method
     * @return Arrival date as {@link DateTime}
     */
    public DateTime getArrivesOn() {
        return arrivesOn;
    }

    /**
     * Getter FarePrices access method
     * @return Fare prices for different classes as {@link FarePrices}
     */
    public FarePrices getFarePrices() {
        return farePrices;
    }
}
