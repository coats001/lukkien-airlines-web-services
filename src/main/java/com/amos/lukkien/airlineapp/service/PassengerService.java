package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.model.Booking;
import com.amos.lukkien.airlineapp.model.Flight;
import com.amos.lukkien.airlineapp.model.Passenger;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
public interface PassengerService {

    public Passenger savePassenger(Passenger  passenger);


}
