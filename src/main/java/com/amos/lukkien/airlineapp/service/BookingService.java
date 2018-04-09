package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Flight;
import com.amos.lukkien.airlineapp.model.Passenger;

import java.util.List;

public interface BookingService {

    public Booking bookFlight(Flight flight, Passenger passenger);


}
