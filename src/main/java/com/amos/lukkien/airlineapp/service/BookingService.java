package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Flight;
import com.amos.lukkien.airlineapp.model.Passenger;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface BookingService {
    /**
     * Saves a booking into the system
     * @param booking
     * @return The booked flight
     */
    public Booking bookFlight(Booking booking);


}
