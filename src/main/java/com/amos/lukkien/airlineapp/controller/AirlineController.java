package com.amos.lukkien.airlineapp.controller;

import com.amos.lukkien.airlineapp.dao.AirportRepository;
import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AirlineController {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private AirportRepository airportRepository;

    @GetMapping("/airports")
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    @GetMapping("/airports/{nameOrCode}")
    public List<Airport> getAirportsByNameOrCode(@PathVariable String nameOrCode) {
        return bookingService.findAirportsByCodeOrName(nameOrCode);
    }

}
