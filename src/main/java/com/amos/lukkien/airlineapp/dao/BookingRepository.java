package com.amos.lukkien.airlineapp.dao;

import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface BookingRepository extends JpaRepository<Booking,Integer> {
    @Query("SELECT b FROM Booking b where b.flight.departure.id = :id")
    Optional<Booking> findAllBookingsByDepartureId(@Param("id") int id);
    @Query("SELECT b FROM Booking b where b.flight.destination.id = :id")
    Optional<Booking> findAllBookingsByDestinationId(@Param("id") int id);
}
