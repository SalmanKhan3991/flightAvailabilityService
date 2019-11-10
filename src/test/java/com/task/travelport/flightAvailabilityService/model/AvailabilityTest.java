package com.task.travelport.flightAvailabilityService.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

/**
 * Unit tests for Availability model class
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class AvailabilityTest {

    private Availability availability;
    private ArrayList<Flight> flights = new ArrayList<>();

    @Before
    public void setup() {
        Fare firstTicket = new Fare("USD", 20.00);
        Fare firstBookingFee = new Fare("USD", 5.00);
        Fare firstTax = new Fare("USD", 3.00);

        Fare economyTicket = new Fare("USD", 15.00);
        Fare economyBookingFee = new Fare("USD", 4.00);
        Fare economyTax = new Fare("USD", 2.50);

        Fare businessTicket = new Fare("USD", 30.00);
        Fare businessBookingFee = new Fare("USD", 6.00);
        Fare businessTax = new Fare("USD", 3.50);


        TravelClass first = new TravelClass(firstTicket, firstBookingFee, firstTax);
        TravelClass economy = new TravelClass(economyTicket, economyBookingFee, economyTax);
        TravelClass business = new TravelClass(businessTicket, businessBookingFee, businessTax);

        FarePrices farePrices = new FarePrices(first, business, economy);

        DateTime arrivesAt = new DateTime("05-01-2014", "2:30PM");
        DateTime departsOn = new DateTime("05-01-2014", "5:30PM");

        Flight flight = new Flight("abc", "xyz", "DUB", "IST", departsOn, arrivesAt, farePrices);

        flights.add(flight);

        availability = new Availability(flights);
    }

    /**
     * Verify that the availability class returns the object with same values as the one created.
     */
    @Test
    public void verifyGetFlights() {

        ArrayList<Flight> resultFlights = availability.getFlights();

        Assert.assertEquals(resultFlights, flights);
    }
}
