package com.amos.lukkien.airlineapp.controller;

import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Departure;
import com.amos.lukkien.airlineapp.model.Destination;
import com.amos.lukkien.airlineapp.model.Passenger;
import com.amos.lukkien.airlineapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/report/departureId/{departureId}")
    public List<Booking> findAllBookingsByDeparture(@PathVariable Integer departureId){
        return reportService.findAllBookingsByDeparture(departureId);

    }

    @GetMapping("/report/destinationId/{destinationId}")
    public List<Booking> findAllBookingsByDestination(@PathVariable Integer destinationId){
        return reportService.findAllBookingsByDestination(destinationId);
    }
}

