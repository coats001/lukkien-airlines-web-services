package com.amos.lukkien.airlineapp.dao;

import com.amos.lukkien.airlineapp.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AirportRepository extends JpaRepository<Airport,Integer> {

    List<Airport> findByNameIgnoreCaseContaining(String name);
    List<Airport> findByCodeIgnoreCaseContaining(String code);
}
