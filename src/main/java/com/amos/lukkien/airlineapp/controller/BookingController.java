package com.amos.lukkien.airlineapp.controller;

import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Flight;
import com.amos.lukkien.airlineapp.model.Passenger;
import com.amos.lukkien.airlineapp.service.AirportService;
import com.amos.lukkien.airlineapp.service.BookingService;
import com.amos.lukkien.airlineapp.service.FlightService;
import com.amos.lukkien.airlineapp.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private AirportService airportService;
    @Autowired
    private BookingService bookingService;
    @Autowired
    private FlightService flightService;
    @Autowired
    private PassengerService passengerService;

    @PostMapping("/booking/flightId/{flightId}/passengerName/{passengerName}/price/{price}")
    public Booking addBooking(@PathVariable Integer flightId, @PathVariable String passengerName, @PathVariable BigDecimal price) {
        Booking booking =  new Booking( flightService.findById(flightId),price, passengerService.savePassenger(new Passenger(passengerName)),new Date());
        return bookingService.bookFlight(booking);
    }
}

