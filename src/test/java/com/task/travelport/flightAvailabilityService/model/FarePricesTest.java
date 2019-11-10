package com.task.travelport.flightAvailabilityService.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class FarePricesTest {

    private FarePrices farePrices;
    private TravelClass first;
    private TravelClass business;
    private TravelClass economy;

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

        first = new TravelClass(firstTicket, firstBookingFee, firstTax);
        economy = new TravelClass(economyTicket, economyBookingFee, economyTax);
        business = new TravelClass(businessTicket, businessBookingFee, businessTax);
        farePrices = new FarePrices(first, business, economy);
    }

    @Test
    public void verifyFarePricesNotNull() {
        Assert.assertNotNull(farePrices);
    }

    @Test
    public void verifyFarePricesValues() {
        Assert.assertEquals(farePrices.getFirst(), first);
        Assert.assertEquals(farePrices.getEconomy(), economy);
        Assert.assertEquals(farePrices.getBusiness(), business);
    }
}
