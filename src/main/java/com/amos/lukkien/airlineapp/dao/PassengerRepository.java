package com.amos.lukkien.airlineapp.dao;

import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
}
