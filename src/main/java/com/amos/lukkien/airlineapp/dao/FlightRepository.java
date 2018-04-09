package com.amos.lukkien.airlineapp.dao;

import com.amos.lukkien.airlineapp.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  FlightRepository extends JpaRepository<Flight,Long>{
}
