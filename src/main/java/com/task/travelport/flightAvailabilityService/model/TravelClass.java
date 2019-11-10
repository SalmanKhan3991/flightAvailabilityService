package com.task.travelport.flightAvailabilityService.model;

/**
 * Model class for TravelClass
 */
public class TravelClass {

    /**
     * Ticket fare
     */
    private final Fare ticket;

    /**
     * Ticket booking fee
     */
    private final Fare bookingFee;

    /**
     * Taxes
     */
    private final Fare tax;

    /**
     * Constructor
     * @param ticket Ticket fare
     * @param bookingFee Booking fee
     * @param tax Tax
     */
    public TravelClass(Fare ticket, Fare bookingFee, Fare tax) {
        this.ticket = ticket;
        this.bookingFee = bookingFee;
        this.tax = tax;
    }

    /**
     * Access method for ticket fare
     * @return Ticket fare as {@link Fare}
     */
    public Fare getTicket() {
        return ticket;
    }

    /**
     * Access method for booking fee
     * @return Booking fee as {@link Fare}
     */
    public Fare getBookingFee() {
        return bookingFee;
    }

    /**
     * Access method for tax charges
     * @return Tax as {@link Fare}
     */
    public Fare getTax() {
        return tax;
    }
}
