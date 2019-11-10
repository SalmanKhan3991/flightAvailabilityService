package com.task.travelport.flightAvailabilityService.service;

import com.task.travelport.flightAvailabilityService.model.Availability;
import com.task.travelport.flightAvailabilityService.model.Query;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(MockitoJUnitRunner.class)
public class AvailabilityServiceImplTest {

    @InjectMocks
    private AvailabilityService availabilityService = new AvailabilityServiceImpl();

    private Query query;

    @Before
    public void setup() {
        query = new Query("ABC", "XYZ", "10-11-2019", "25-11-2019", 5);
    }

    @Test
    public void verifyAvailabilityIsReceived() {
        System.out.println(availabilityService.getAvailability(query));
    }

}
