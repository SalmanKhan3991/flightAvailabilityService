package com.task.travelport.flightAvailabilityService.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class TravelClassTest {

    private TravelClass travelClass;

    @Before
    public void setup() {
        travelClass = new TravelClass(new Fare("EUR", 20.00), new Fare("EUR", 5.00), new Fare("EUR", 2.00));
    }

    @Test
    public void verifyGetTicket() {
        Fare ticketFee = travelClass.getTicket();
        Assert.assertEquals(ticketFee.getAmount(), 20.00, 0.0);
        Assert.assertEquals(ticketFee.getCurrency(), "EUR");
    }

    @Test
    public void verifyBookingFee() {
        Fare bookingFee = travelClass.getBookingFee();

        Assert.assertEquals(bookingFee.getCurrency(), "EUR");
        Assert.assertEquals(bookingFee.getAmount(), 5.00, 0.00);
    }

    @Test
    public void verifyTaxNotNull() {
        Fare tax = travelClass.getTax();
        Assert.assertNotNull(tax);
    }


}
