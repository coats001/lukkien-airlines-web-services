package com.amos.lukkien.airlineapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Flight {
    public Flight() {
    }

    public Flight(AirplaneCompany airplaneCompany, Departure departure, Destination destination, List<Booking> bookings) {
        this.airplaneCompany = airplaneCompany;
        this.departure = departure;
        this.destination = destination;
        this.bookings = bookings;
    }

    @Id
    @GeneratedValue
    protected int id;
    @ManyToOne
    protected AirplaneCompany airplaneCompany;
    @OneToOne
    protected Departure departure;
    @OneToOne
    protected Destination destination;
    // here we use List not set since
    //same flight can be booked multiple times
    @OneToMany
    protected List<Booking> bookings;

    public int getId() {
        return id;
    }

    public AirplaneCompany getAirplaneCompany() {
        return airplaneCompany;
    }

    public Departure getDeparture() {
        return departure;
    }

    public Destination getDestination() {
        return destination;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", airplaneCompany=" + airplaneCompany +
                ", departure=" + departure +
                ", destination=" + destination +
                ", bookings=" + bookings +
                '}';
    }
}
