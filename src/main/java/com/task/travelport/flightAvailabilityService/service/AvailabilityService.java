package com.task.travelport.flightAvailabilityService.service;

import com.task.travelport.flightAvailabilityService.model.Availability;
import com.task.travelport.flightAvailabilityService.model.Flight;
import com.task.travelport.flightAvailabilityService.model.Query;

/**
 * Availability Service: Provides availability of flights as a JSON
 */
public interface AvailabilityService {

    /**
     * Gets {@link Availability} of the flights with the given query
     * @param query Query containing input params
     * @return {@link Availability}
     */
    public abstract Availability getAvailability(Query query);
}
