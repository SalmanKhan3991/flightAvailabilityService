package com.task.travelport.flightAvailabilityService.model;

/**
 * FarePrices model class
 */
public class FarePrices {

    /**
     * First class
     */
    private final TravelClass first;

    /**
     * Business class
     */
    private final TravelClass business;

    /**
     * Economy class
     */
    private final TravelClass economy;

    /**
     * Construtor
     * @param first first class
     * @param business business class
     * @param economy economy class
     */
    public FarePrices(TravelClass first, TravelClass business, TravelClass economy) {
        this.first = first;
        this.business = business;
        this.economy = economy;
    }

    /**
     * Getter firstClass access method
     * @return first class as {@link TravelClass}
     */
    public TravelClass getFirst() {
        return first;
    }

    /**
     * Getter businessClass access method
     * @return business class as {@link TravelClass}
     */
    public TravelClass getBusiness() {
        return business;
    }

    /**
     * Getter economyClass access method
     * @return economy class as {@link TravelClass}
     */
    public TravelClass getEconomy() {
        return economy;
    }
}
