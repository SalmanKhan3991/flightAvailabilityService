package com.task.travelport.flightAvailabilityService.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class FareTest {

    private Fare fare;
    private final String CURRENCY = "USD";
    private final double AMOUNT = 20.00;

    @Before
    public void setup() {
        fare = new Fare(CURRENCY, AMOUNT);
    }

    @Test
    public void verifyFareNotNull() {
        Assert.assertNotNull(fare);
    }

    @Test
    public void verifyFareValues() {
        Assert.assertEquals(fare.getAmount(), AMOUNT, 0.0);
        Assert.assertEquals(fare.getCurrency(), CURRENCY);
    }
}
