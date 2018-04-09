package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.dao.AirportRepository;
import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Flight;
import com.amos.lukkien.airlineapp.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class BookingServiceImpl implements BookingService {


    @Override
    public Booking bookFlight(Flight flight, Passenger passenger) {
        return null;
    }
}
