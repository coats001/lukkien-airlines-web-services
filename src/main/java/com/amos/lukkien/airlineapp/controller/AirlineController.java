package com.amos.lukkien.airlineapp.controller;

import com.amos.lukkien.airlineapp.dao.AirportRepository;
import com.amos.lukkien.airlineapp.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AirlineController {
    @Autowired
    private AirportRepository airportRepository;
    @GetMapping("/airports")
    public List<Airport> getAllAirport() {
        return airportRepository.findAll();
    }

    @GetMapping("/airports/{name}")
    public List<Airport> getAirportByName(@PathVariable String name) {

        Airport airport = new Airport();
        airport.setName(name);
        Example<Airport> example = Example.of(airport);
        List<Airport> results = airportRepository.findAll(example);

        return results;
    }

}
