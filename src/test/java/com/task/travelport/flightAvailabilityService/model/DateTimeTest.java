package com.task.travelport.flightAvailabilityService.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class DateTimeTest {

    DateTime DATE_TIME;
    private final String DATE = "25-11-2019";
    private final String TIME = "03:50PM";

    @Before
    public void setup() {
        DATE_TIME = new DateTime(DATE, TIME);
    }

    @Test
    public void verifyDateTimeNotNull() {
        Assert.assertNotNull(DATE_TIME);
    }

    @Test
    public void verifyDateTimeValues() {
        Assert.assertEquals(DATE_TIME.getDate(), DATE);
        Assert.assertEquals(DATE_TIME.getTime(), TIME);
    }
}
