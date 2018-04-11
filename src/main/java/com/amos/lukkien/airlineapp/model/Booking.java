package com.amos.lukkien.airlineapp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
public class Booking {
    public Booking() {
    }

    public Booking(Flight flight, BigDecimal price, Passenger passenger, Date flightDate) {
        this.flight = flight;
        this.price = price;
        this.passenger = passenger;
        this.flightDate = flightDate;
    }

    @Id
    @GeneratedValue
    protected int id;
    @ManyToOne
    private Flight flight;
    //Gives flexibility of determining price per booking iso per flight
    @Column
    private BigDecimal price;
    @OneToOne
    private Passenger passenger;

    public int getId() {
        return id;
    }

    public Flight getFlight() {
        return flight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Passenger getPassenger() {
        return passenger;
    }
    @Column
    private Date flightDate;

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", flight=" + flight +
                ", price=" + price +
                ", passenger=" + passenger +
                ", flightDate=" + flightDate +
                '}';
    }
}
