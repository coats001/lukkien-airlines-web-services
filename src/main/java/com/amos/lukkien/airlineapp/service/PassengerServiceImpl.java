package com.amos.lukkien.airlineapp.service;

import com.amos.lukkien.airlineapp.dao.PassengerRepository;
import com.amos.lukkien.airlineapp.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PassengerServiceImpl implements PassengerService{
@Autowired
    private PassengerRepository passengerRepository;
    public Passenger savePassenger(Passenger passenger){
        return passengerRepository.save(passenger);
    }
}
