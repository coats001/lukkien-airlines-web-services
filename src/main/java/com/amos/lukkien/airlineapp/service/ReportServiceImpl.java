package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.dao.BookingRepository;
import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Departure;
import com.amos.lukkien.airlineapp.model.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ReportServiceImpl implements ReportService{
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> findAllBookingsByDeparture(Integer departureId){
       return bookingRepository.findAllBookingsByDepartureId(departureId);

    }
    @Override
    public List<Booking> findAllBookingsByDestination(Integer destinationId){
        return bookingRepository.findAllBookingsByDestinationId(destinationId);
    }
}
