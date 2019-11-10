package com.task.travelport.flightAvailabilityService.service;

import com.task.travelport.flightAvailabilityService.model.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * Implementation of the {@link AvailabilityService}
 */
@Service
public class AvailabilityServiceImpl implements AvailabilityService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${availability.service.url}")
    private String URL;

    public AvailabilityServiceImpl() { }

    @Override
    public Availability getAvailability(Query query) {

        /**
         Commenting this out since the API is returning 404 for the call. Uncomment this when the API starts working.
//         HttpHeaders headers = new HttpHeaders();
//         headers.setAccept(Arrays.asList(MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML));
//         HttpEntity<String> entity = new HttpEntity<String>(headers);
//
//         String queryURL = URL + query.getOrigin() + "/" + query.getDestination() + "/"
//         + query.getDepartureDate() + "/" + query.getReturnDate() + "/" + query.getNumOfPassengers();
         */

        System.out.println("Service URL: " + URL);
        try {
//            Code commented since the API is not working. Uncomment when it works
//            ResponseEntity<String> response = restTemplate.exchange(queryURL, HttpMethod.GET, entity, String.class);

            String TEST_XML = "<Availability>\n" +
                    "  <Flight>\n" +
                    "    <CarrierCode>EI</CarrierCode>\n" +
                    "    <FlightDesignator>EI554</FlightDesignator>\n" +
                    "    <OriginAirport>IST</OriginAirport>\n" +
                    "    <DestinationAirport>DUB</DestinationAirport>\n" +
                    "    <DepartureDate>2014-01-02T10:48:00.000Z</DepartureDate>\n" +
                    "    <ArrivalDate>2014-01-02T13:04:00.000Z</ArrivalDate>\n" +
                    "    <Fares>\n" +
                    "      <Fare class=\"FIF\">\n" +
                    "        <BasePrice>EUR 272.00</BasePrice>\n" +
                    "        <Fees>EUR 17.00</Fees>\n" +
                    "        <Tax>EUR 13.60</Tax>\n" +
                    "      </Fare>\n" +
                    "      <Fare class=\"CIF\">\n" +
                    "        <BasePrice>EUR 136.00</BasePrice>\n" +
                    "        <Fees>EUR 17.00</Fees>\n" +
                    "        <Tax>EUR 13.60</Tax>\n" +
                    "      </Fare>\n" +
                    "      <Fare class=\"YIF\">\n" +
                    "        <BasePrice>EUR 68.00</BasePrice>\n" +
                    "        <Fees>EUR 17.00</Fees>\n" +
                    "        <Tax>EUR 13.60</Tax>\n" +
                    "      </Fare>\n" +
                    "    </Fares>\n" +
                    "  </Flight>\n" +
                    "  <Flight>\n" +
                    "    <CarrierCode>EI</CarrierCode>\n" +
                    "    <FlightDesignator>EI520</FlightDesignator>\n" +
                    "    <OriginAirport>BOS</OriginAirport>\n" +
                    "    <DestinationAirport>DUB</DestinationAirport>\n" +
                    "    <DepartureDate>2014-01-05T02:03:00.000Z</DepartureDate>\n" +
                    "    <ArrivalDate>2014-01-05T07:15:00.000Z</ArrivalDate>\n" +
                    "    <Fares>\n" +
                    "      <Fare class=\"FIF\">\n" +
                    "        <BasePrice>EUR 1248.00</BasePrice>\n" +
                    "        <Fees>EUR 78.00</Fees>\n" +
                    "        <Tax>EUR 62.40</Tax>\n" +
                    "      </Fare>\n" +
                    "      <Fare class=\"CIF\">\n" +
                    "        <BasePrice>EUR 624.00</BasePrice>\n" +
                    "        <Fees>EUR 78.00</Fees>\n" +
                    "        <Tax>EUR 62.40</Tax>\n" +
                    "      </Fare>\n" +
                    "      <Fare class=\"YIF\">\n" +
                    "        <BasePrice>EUR 312.00</BasePrice>\n" +
                    "        <Fees>EUR 78.00</Fees>\n" +
                    "        <Tax>EUR 62.40</Tax>\n" +
                    "      </Fare>\n" +
                    "    </Fares>\n" +
                    "  </Flight>\n" +
                    "  <Flight>\n" +
                    "    <CarrierCode>EI</CarrierCode>\n" +
                    "    <FlightDesignator>EI239</FlightDesignator>\n" +
                    "    <OriginAirport>LHR</OriginAirport>\n" +
                    "    <DestinationAirport>DUB</DestinationAirport>\n" +
                    "    <DepartureDate>2014-01-06T17:56:00.000Z</DepartureDate>\n" +
                    "    <ArrivalDate>2014-01-06T20:20:00.000Z</ArrivalDate>\n" +
                    "    <Fares>\n" +
                    "      <Fare class=\"FIF\">\n" +
                    "        <BasePrice>EUR 144.00</BasePrice>\n" +
                    "        <Fees>EUR 9.00</Fees>\n" +
                    "        <Tax>EUR 7.20</Tax>\n" +
                    "      </Fare>\n" +
                    "      <Fare class=\"CIF\">\n" +
                    "        <BasePrice>EUR 72.00</BasePrice>\n" +
                    "        <Fees>EUR 9.00</Fees>\n" +
                    "        <Tax>EUR 7.20</Tax>\n" +
                    "      </Fare>\n" +
                    "      <Fare class=\"YIF\">\n" +
                    "        <BasePrice>EUR 36.00</BasePrice>\n" +
                    "        <Fees>EUR 9.00</Fees>\n" +
                    "        <Tax>EUR 7.20</Tax>\n" +
                    "      </Fare>\n" +
                    "    </Fares>\n" +
                    "  </Flight>\n" +
                    "</Availability>";
            JSONObject xmlJsonObj = XML.toJSONObject(TEST_XML);

//            Using the above sample XML since the API is not working. Uncomment this when API starts working.
//            JSONObject xmlJsonObj = XML.toJSONObject(response.getBody());

            JSONArray flightsArray = xmlJsonObj.getJSONObject("Availability").getJSONArray("Flight");

            ArrayList<Flight> flights = new ArrayList<>();
            for (int i = 0; i < flightsArray.length(); i++) {
                JSONObject jsonObject = (JSONObject) flightsArray.get(i);
                flights.add(getFlight(jsonObject));
            }
            return new Availability(flights);
        } catch (JSONException je) {
            je.printStackTrace();
        } catch (RestClientException rce) {
            rce.printStackTrace();
        }
        return null;
    }

    /**
     * Converts flight JSON object to Java object
     *
     * @param flightObject {@link JSONObject}
     * @return flight {@link Flight}
     */
    private Flight getFlight(JSONObject flightObject) {

        String operator = null;
        String flightNumber = null;
        String departsFrom = null;
        String arrivesAt = null;
        DateTime departsOn = null;
        DateTime arrivesOn = null;
        FarePrices farePrices = null;

        Set<String> keys = flightObject.keySet();
        Iterator itr = keys.iterator();
        while (itr.hasNext()) {
            String key = (String) itr.next();
            if ("FlightDesignator".equals(key)) {
                flightNumber = flightObject.getString(key);
            } else if ("OriginAirport".equals(key)) {
                departsFrom = flightObject.getString(key);
            } else if ("CarrierCode".equals(key)) {
                operator = flightObject.getString(key);
            } else if ("DestinationAirport".equals(key)) {
                arrivesAt = flightObject.getString(key);
            } else if ("ArrivalDate".equals(key)) {
                arrivesOn = getDateTime(flightObject.getString(key));
            } else if ("DepartureDate".equals(key)) {
                departsOn = getDateTime(flightObject.getString(key));
            } else if ("Fares".equals(key)) {
                farePrices = getFarePrices(flightObject.getJSONObject(key));
            }
        }
        return new Flight(operator, flightNumber, departsFrom, arrivesAt, departsOn, arrivesOn, farePrices);
    }

    /**
     * Splits the ISO 8601 standard date string to date and time values
     *
     * @param dateString ISO 8601 standard date string
     * @return {@link DateTime} with split date and time values
     */
    private DateTime getDateTime(String dateString) {
        String[] dateValues = dateString.split("T");
        return new DateTime(dateValues[0], dateValues[1]);
    }

    /**
     * Constructs {@link FarePrices} object from the given {@link JSONObject}
     *
     * @param fareObject {@link JSONObject}
     * @return {@link FarePrices}
     */
    private FarePrices getFarePrices(JSONObject fareObject) {
        JSONArray fares = fareObject.getJSONArray("Fare");
        TravelClass first = null;
        TravelClass business = null;
        TravelClass economy = null;
        for (int i = 0; i < fares.length(); i++) {
            JSONObject obj = (JSONObject) fares.get(i);
            Fare ticket = getFare(obj.getString("BasePrice"));
            Fare tax = getFare(obj.getString("Tax"));
            Fare booking = getFare(obj.getString("Fees"));
            if ("FIF".equals(obj.getString("class"))) {
                first = new TravelClass(ticket, booking, tax);
            } else if ("CIF".equals(obj.getString("class"))) {
                business = new TravelClass(ticket, booking, tax);
            } else if ("YIF".equals(obj.getString("class"))) {
                economy = new TravelClass(ticket, booking, tax);
            }
        }
        return new FarePrices(first, business, economy);
    }

    /**
     * Constructs {@link Fare} object with given input String
     *
     * @param fareString String containing currency and the amount
     * @return {@link Fare}
     */
    private Fare getFare(String fareString) {
        String[] parsedFare = fareString.split(" ");
        return new Fare(parsedFare[0], Double.parseDouble(parsedFare[1]));
    }
}
