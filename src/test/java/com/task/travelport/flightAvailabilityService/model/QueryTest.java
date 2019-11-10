package com.task.travelport.flightAvailabilityService.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class QueryTest {

    private Query query;

    private final String ORIGIN = "DUB";
    private final String DESTINATION = "IST";
    private final String DEPARTURE_DATE = "09-11-2019";
    private final String RETURN_DATE = "25-11-2019";
    private final int NUM_OF_PASSENGERS = 100;

    @Before
    public void setup() {
        query = new Query(ORIGIN,DESTINATION, DEPARTURE_DATE, RETURN_DATE, NUM_OF_PASSENGERS);
    }

    @Test
    @Order(value = 1)
    public void verifyQueryNotNull() {
        Assert.assertNotNull(query);
    }

    @Test
    @Order(value = 2)
    public void verifyQueryValues() {
        Assert.assertEquals(query.getOrigin(), ORIGIN);
        Assert.assertEquals(query.getDestination(), DESTINATION);
        Assert.assertEquals(query.getDepartureDate(), DEPARTURE_DATE);
        Assert.assertEquals(query.getReturnDate(), RETURN_DATE);
        Assert.assertEquals(query.getNumOfPassengers(), NUM_OF_PASSENGERS, 0);
    }
}
