package com.amos.lukkien.airlineapp.dao;

import com.amos.lukkien.airlineapp.model.Airport;
import com.amos.lukkien.airlineapp.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
