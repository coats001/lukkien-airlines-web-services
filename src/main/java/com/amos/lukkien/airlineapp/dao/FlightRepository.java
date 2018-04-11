package com.amos.lukkien.airlineapp.dao;

import com.amos.lukkien.airlineapp.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface FlightRepository extends JpaRepository<Flight, Integer> {

    @Query("SELECT f FROM Flight f where f.destination.airport.name like %:nameOrCode%")
    List<Flight> findFlightsByNameOrCodeDestinationAirport(@Param("nameOrCode") String nameOrCode);

    @Query("SELECT f FROM Flight f where f.departure.airport.name like %:nameOrCode%")
    List<Flight> findFlightsByNameOrCodeDepartureAirport(@Param("nameOrCode") String nameOrCode);

    @Query("SELECT f FROM Flight f where f.departure.id = :id")
    List<Flight> findFlightByDepartureId(@Param("id") int id);

    @Query("SELECT f FROM Flight f where f.destination.id =  :id")
    List<Flight> findFlightByDestinationId(@Param("id") int id);
}
