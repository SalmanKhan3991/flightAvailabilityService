package com.task.travelport.flightAvailabilityService.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class FlightTest {

    private Flight FLIGHT;
    private final String OPERATOR = "KLM";
    private final String FLIGHT_NUMBER = "18739EF";
    private final String DEPARTS_FROM = "DUB";
    private final String ARRIVES_AT = "IST";
    private final DateTime DEPARTS_ON = new DateTime("15-11-2019", "2:30 PM");
    private final DateTime ARRIVES_ON = new DateTime("14-11-2019", "6:30 PM");
    private FarePrices FARE_PRICES;

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

        FARE_PRICES = new FarePrices(first, business, economy);
        FLIGHT = new Flight(OPERATOR, FLIGHT_NUMBER, DEPARTS_FROM, ARRIVES_AT, DEPARTS_ON, ARRIVES_ON, FARE_PRICES);
    }

    @Test
    @Order(value =1)
    public void verifyFlightNotNull() {
        Assert.assertNotNull(FLIGHT);
    }

    @Test
    @Order(value=2)
    public void verifyFlightValues() {
        Assert.assertEquals(FLIGHT.getOperator(), OPERATOR);
        Assert.assertEquals(FLIGHT.getFlightNumber(), FLIGHT_NUMBER);
        Assert.assertEquals(FLIGHT.getDepartsFrom(), DEPARTS_FROM);
        Assert.assertEquals(FLIGHT.getArrivesAt(), ARRIVES_AT);
        Assert.assertEquals(FLIGHT.getDepartsOn(), DEPARTS_ON);
        Assert.assertEquals(FLIGHT.getArrivesOn(), ARRIVES_ON);
        Assert.assertEquals(FLIGHT.getFarePrices(), FARE_PRICES);
    }
}
