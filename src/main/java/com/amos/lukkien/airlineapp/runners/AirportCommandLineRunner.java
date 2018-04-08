package com.amos.lukkien.airlineapp.runners;

import com.amos.lukkien.airlineapp.dao.AirportRepository;
import com.amos.lukkien.airlineapp.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class AirportCommandLineRunner implements CommandLineRunner {

    @Autowired
    AirportRepository airportRepository;
    @Override
    public void run(String... args) throws Exception {
        Airport londonAirport = new Airport("London","LND");
        airportRepository.save(londonAirport);
    }
}
