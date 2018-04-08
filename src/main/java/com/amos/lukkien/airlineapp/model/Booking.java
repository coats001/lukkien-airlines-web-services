package com.amos.lukkien.airlineapp.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
public class Booking {
    public Booking() {
    }

    public Booking(Flight flight, BigDecimal price) {
        this.flight = flight;
        this.price = price;
    }

    @Id
    @GeneratedValue
    protected int id;
    @ManyToOne
    private Flight flight;
    //Gives flexibility of determining price per booking iso per flight
    @Column
    private BigDecimal price;
}
