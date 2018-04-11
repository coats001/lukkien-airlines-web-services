package com.amos.lukkien.airlineapp.controller;

import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Flight;
import com.amos.lukkien.airlineapp.model.Passenger;
import com.amos.lukkien.airlineapp.service.AirportService;
import com.amos.lukkien.airlineapp.service.BookingService;
import com.amos.lukkien.airlineapp.service.FlightService;
import com.amos.lukkien.airlineapp.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private AirportService airportService;
    @Autowired
    private BookingService bookingService;
    @Autowired
    private FlightService flightService;
    @Autowired
    private PassengerService passengerService;

    @GetMapping("/flight/destination/nameOrCode/{nameOrCode}")
    public List<Flight> findFlightByDestinationNameOrCode(@PathVariable String nameOrCode) {

        return flightService.findFlightByDestinationNameOrCode(nameOrCode);
    }
    @GetMapping("/flight/departure/nameOrCode/{nameOrCode}")
    public List<Flight> findFlightByDepartureNameOrCode(@PathVariable String nameOrCode) {

        return flightService.findFlightByDepartureNameOrCode(nameOrCode);
    }
}

