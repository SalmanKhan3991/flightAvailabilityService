package com.task.travelport.flightAvailabilityService.model;

/**
 * Query class depicting input parameters
 */
public class Query {

    /**
     * Flight origin location
     */
    private final String origin;

    /**
     * Flight destination location
     */
    private final String destination;

    /**
     * Departure date
     */
    private final String departureDate;

    /**
     * Return date
     */
    private final String returnDate;

    /**
     * Number of passengers to be booked
     */
    private final int numOfPassengers;

    /**
     * Constructor
     * @param origin Flight origin
     * @param destination Flight destination
     * @param departureDate Departure date of the Passenger
     * @param returnDate Return date of the passenger
     * @param numOfPassengers Number of passengers to be booked
     */
    public Query(String origin, String destination, String departureDate, String returnDate, int numOfPassengers) {
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.numOfPassengers = numOfPassengers;
    }

    /**
     * Access method for Origin location
     * @return Origin as String
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Access method for destination
     * @return Destination as String
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Access method for Departure Date
     * @return DepartureDate as String
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Access method for Return Date
     * @return ReturnDate as String
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Access method for Number of passengers to be booked
     * @return NumberOfPassengers as integer
     */
    public int getNumOfPassengers() {
        return numOfPassengers;
    }
}
