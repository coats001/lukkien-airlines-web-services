package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.model.Flight;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FlightService {
    Flight findById(Integer  id);
    List<Flight> findFlightByDestinationNameOrCode(String nameOrCode);
    List<Flight> findFlightByDepartureNameOrCode(String nameOrCode);
}
