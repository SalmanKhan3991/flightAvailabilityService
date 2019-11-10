package com.task.travelport.flightAvailabilityService.controller;

import com.task.travelport.flightAvailabilityService.model.Availability;
import com.task.travelport.flightAvailabilityService.model.Query;
import com.task.travelport.flightAvailabilityService.service.AvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller managing the requests for flight availability
 */
@RestController
public class AvailabilityController {

    @Autowired
    AvailabilityService availabilityService;

    /**
     * Method mapping the request for flights with given input params. All the input params are passed as {@link PathVariable}
     * @param origin Origin location as String
     * @param destination Destination location as String
     * @param departureDate DepartureDate as String
     * @param returnDate Return date as String
     * @param numOfPassengers Number of Passengers to be booked
     * @return {@link Availability} of flights for the given params
     */
    @RequestMapping(value = "/flights/{origin}/{destination}/{start}/{end}/{pax}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Availability getAvailability(@PathVariable("origin") String origin,
                                        @PathVariable("destination") String destination,
                                        @PathVariable("start") String departureDate,
                                        @PathVariable("end") String returnDate,
                                        @PathVariable("pax") int numOfPassengers) {

        Query query = new Query(origin, destination, departureDate, returnDate, numOfPassengers);
        return availabilityService.getAvailability(query);
    }
}
