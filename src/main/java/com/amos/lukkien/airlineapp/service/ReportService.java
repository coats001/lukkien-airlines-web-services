package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Departure;

import java.util.List;

public interface ReportService {
    public List<Booking> findAllBookingsByDeparture(Departure departure);
    public List<Booking> findAllBookingsByDestination(Departure departure);
}
