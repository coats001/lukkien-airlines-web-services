package com.amos.lukkien.airlineapp.dao;

import com.amos.lukkien.airlineapp.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AirportRepository extends JpaRepository<Airport,Long> {
}
