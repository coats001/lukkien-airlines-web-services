package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.model.Airport;

import java.util.List;

public interface AirportService {
    public List<Airport> findAirportsByCodeOrName(String codeOrName);
}
