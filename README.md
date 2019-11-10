# Flight Availability Service
 Travelport flight availability service

### Code Structure

The code consists of 
- main class FlightAvailabilityServiceApplication. This starts the spring boot application.
- controller class in controller package containing the request mapping(GET) of ```/flights/{origin}/{destination}/{start}/{end}/{pax}```
- model POJO classes in model package containing the model objects (Availability, DateTime, Fare, FarePrices, Flight, Query and TravelClass).
- service interface and implementation in service package.

The test package consists of the same structure as the main implementation classes structure with all the test cases for respective classes.

### Endpoint

```
/flights/{origin}/{destination}/{start}/{end}/{pax}
```
The request mapping takes the input parameters in the form of path variables as shown above and passes on to the service to get the json response.
The service(availability service) takes these parameters as input params and calls the API to get the XML response. The XML response is then parsed to JSON object and sent back to the controller as response.

### Running the Application

To run the service, you could use any IDE(I used IntelliJ) or you could use command line tools with Maven. The command to run the application with maven is as follows.

```mvn spring-boot:run```

You could also package the application as jar application and run within java environment.

Command to package the application

```mvn clean package```

This generates the jar file with filename ```flightAvailabilityService-0.0.1-SNAPSHOT.jar``` in target folder

Command to run the jar file

```java -jar target/flightAvailabilityService-0.0.1-SNAPSHOT.jar```

Open any browser on the machine where the jar is running and enter the following url

```http://localhost:8080/flights/{origin}/{destination}/{start}/{end}/{pax}```

Substitute the parameters with relevant values.

#### Note:

The mock request for the API ```http://private-anon-0f7ed275bb-mockairline.apiary-mock.com/flights/{origin}/{destination}/{start}/{end}/{pax}``` is returning '404 not found' error. Hence I have commented the code to call the API and used a sample XML to get the results. When the API is working, uncomment the code in AvailabilityService class and rerun the application.

### Sample output

```json

{ 
   "flights":[ 
      { 
         "operator":"EI",
         "flightNumber":"EI554",
         "departsFrom":"IST",
         "arrivesAt":"DUB",
         "departsOn":{ 
            "date":"2014-01-02",
            "time":"10:48:00.000Z"
         },
         "arrivesOn":{ 
            "date":"2014-01-02",
            "time":"13:04:00.000Z"
         },
         "farePrices":{ 
            "first":{ 
               "ticket":{ 
                  "currency":"EUR",
                  "amount":272.0
               },
               "bookingFee":{ 
                  "currency":"EUR",
                  "amount":17.0
               },
               "tax":{ 
                  "currency":"EUR",
                  "amount":13.6
               }
            },
            "business":{ 
               "ticket":{ 
                  "currency":"EUR",
                  "amount":136.0
               },
               "bookingFee":{ 
                  "currency":"EUR",
                  "amount":17.0
               },
               "tax":{ 
                  "currency":"EUR",
                  "amount":13.6
               }
            },
            "economy":{ 
               "ticket":{ 
                  "currency":"EUR",
                  "amount":68.0
               },
               "bookingFee":{ 
                  "currency":"EUR",
                  "amount":17.0
               },
               "tax":{ 
                  "currency":"EUR",
                  "amount":13.6
               }
            }
         }
      },
      { 
         "operator":"EI",
         "flightNumber":"EI520",
         "departsFrom":"BOS",
         "arrivesAt":"DUB",
         "departsOn":{ 
            "date":"2014-01-05",
            "time":"02:03:00.000Z"
         },
         "arrivesOn":{ 
            "date":"2014-01-05",
            "time":"07:15:00.000Z"
         },
         "farePrices":{ 
            "first":{ 
               "ticket":{ 
                  "currency":"EUR",
                  "amount":1248.0
               },
               "bookingFee":{ 
                  "currency":"EUR",
                  "amount":78.0
               },
               "tax":{ 
                  "currency":"EUR",
                  "amount":62.4
               }
            },
            "business":{ 
               "ticket":{ 
                  "currency":"EUR",
                  "amount":624.0
               },
               "bookingFee":{ 
                  "currency":"EUR",
                  "amount":78.0
               },
               "tax":{ 
                  "currency":"EUR",
                  "amount":62.4
               }
            },
            "economy":{ 
               "ticket":{ 
                  "currency":"EUR",
                  "amount":312.0
               },
               "bookingFee":{ 
                  "currency":"EUR",
                  "amount":78.0
               },
               "tax":{ 
                  "currency":"EUR",
                  "amount":62.4
               }
            }
         }
      },
      { 
         "operator":"EI",
         "flightNumber":"EI239",
         "departsFrom":"LHR",
         "arrivesAt":"DUB",
         "departsOn":{ 
            "date":"2014-01-06",
            "time":"17:56:00.000Z"
         },
         "arrivesOn":{ 
            "date":"2014-01-06",
            "time":"20:20:00.000Z"
         },
         "farePrices":{ 
            "first":{ 
               "ticket":{ 
                  "currency":"EUR",
                  "amount":144.0
               },
               "bookingFee":{ 
                  "currency":"EUR",
                  "amount":9.0
               },
               "tax":{ 
                  "currency":"EUR",
                  "amount":7.2
               }
            },
            "business":{ 
               "ticket":{ 
                  "currency":"EUR",
                  "amount":72.0
               },
               "bookingFee":{ 
                  "currency":"EUR",
                  "amount":9.0
               },
               "tax":{ 
                  "currency":"EUR",
                  "amount":7.2
               }
            },
            "economy":{ 
               "ticket":{ 
                  "currency":"EUR",
                  "amount":36.0
               },
               "bookingFee":{ 
                  "currency":"EUR",
                  "amount":9.0
               },
               "tax":{ 
                  "currency":"EUR",
                  "amount":7.2
               }
            }
         }
      }
   ]
}

```