package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Departure;
import com.amos.lukkien.airlineapp.model.Destination;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ReportService {
    public List<Booking> findAllBookingsByDeparture(Integer departureId);
    public List<Booking> findAllBookingsByDestination(Integer destinationId);
}
