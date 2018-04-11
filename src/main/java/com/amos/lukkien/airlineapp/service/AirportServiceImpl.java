package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.dao.AirportRepository;
import com.amos.lukkien.airlineapp.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Component
public class AirportServiceImpl implements  AirportService {
    @Autowired
    private AirportRepository airportRepository;
    @Override
    public List<Airport> findAirportsByCodeOrName(String codeOrName) {

        List<Airport> results = new ArrayList<>();
        if (codeOrName.length() < 4) {
            Set<Airport> resultSet = new HashSet<>();
            List<Airport> airportsByCode = airportRepository.findByCodeIgnoreCaseContaining(codeOrName);
            List<Airport> airportsByName = airportRepository.findByNameIgnoreCaseContaining(codeOrName);
            resultSet.addAll(airportsByCode);
            resultSet.addAll(airportsByName);
            results.addAll(resultSet);
        }else {
            return airportRepository.findByNameIgnoreCaseContaining(codeOrName);
        }
        return results;
    }

   @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }
}
