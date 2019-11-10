package com.task.travelport.flightAvailabilityService.controller;

import com.task.travelport.flightAvailabilityService.model.Query;
import com.task.travelport.flightAvailabilityService.service.AvailabilityService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(AvailabilityController.class)
public class AvailabilityControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private AvailabilityService availabilityService;

    private final String ORIGIN = "DUB";
    private final String DESTINATION = "IST";
    private final String DEPARTURE_DATE = "10-11-2019";
    private final String RETURN_DATE = "25-11-2019";
    private final int NUM_OF_PASSENGERS = 100;
    private final String SEPARATOR = "/";

    @Test
    public void verifyResponseIsRecieved() throws Exception{

        mvc.perform(get("/flights" + SEPARATOR + ORIGIN + SEPARATOR + DESTINATION + SEPARATOR + DEPARTURE_DATE + SEPARATOR + RETURN_DATE + SEPARATOR + NUM_OF_PASSENGERS))
                .andExpect(status().isOk());
    }

}
