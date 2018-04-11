package com.amos.lukkien.airlineapp.controller;

import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AirportController {

    @Autowired
    private AirportService airportService;



    @GetMapping("/airports")
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @GetMapping("/airports/{nameOrCode}")
    public List<Airport> getAirportsByNameOrCode(@PathVariable String nameOrCode) {
        return airportService.findAirportsByCodeOrName(nameOrCode);
    }

}
