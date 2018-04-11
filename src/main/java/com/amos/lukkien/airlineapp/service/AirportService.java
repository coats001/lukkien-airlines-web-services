package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.model.Airport;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface AirportService {
    /**
     * Finds all Airports by code or name
     * @param codeOrName
     * @return List of Airports
     */
    public List<Airport> findAirportsByCodeOrName(String codeOrName);

    /**
     * Finds all Airports by code or name
     * @return List of Airports
     */
    public List<Airport> getAllAirports();
}
