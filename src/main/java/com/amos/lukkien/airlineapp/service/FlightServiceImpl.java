package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.dao.FlightRepository;
import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightRepository flightRepository;
    @Autowired
    private AirportService airportService;

    @Override
    public Flight findById(Integer id) {
        return flightRepository.findById(id).get();
    }

    @Override
    public List<Flight> findFlightByDestinationNameOrCode(String nameOrCode){
        return flightRepository.findFlightsByNameOrCodeDestinationAirport(nameOrCode);
    }
    @Override
    public List<Flight> findFlightByDepartureNameOrCode(String nameOrCode){
        return flightRepository.findFlightsByNameOrCodeDepartureAirport(nameOrCode);
    }
}
