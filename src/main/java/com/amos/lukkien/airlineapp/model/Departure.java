package com.amos.lukkien.airlineapp.model;

import javax.persistence.*;
import java.sql.Time;
@Entity
@Table
public class Departure {
    public Departure() {
    }

    public Departure(Time departureTime, Airport airport) {
        this.departureTime = departureTime;
        this.airport = airport;
    }

    @Id
    @GeneratedValue
    protected int id;
    @Column(name="departure_time")
    protected Time departureTime;
    @ManyToOne
    protected Airport airport;
    @OneToOne
    protected Flight flight;

    public Time getDepartureTime() {
        return departureTime;
    }

    public Airport getAirport() {
        return airport;
    }

    @Override
    public String toString() {
        return "Departure{" +
                "id=" + id +
                ", departureTime=" + departureTime +
                ", airport=" + airport +
                '}';
    }
}
