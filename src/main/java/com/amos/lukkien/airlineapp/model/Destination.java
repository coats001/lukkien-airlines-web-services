package com.amos.lukkien.airlineapp.model;

import javax.persistence.*;

@Entity
@Table
public class Destination {
    //Instead of two name string (in Departure and Destination) that will have to
    //be maintained we have the nae now in one place. The airport can be in Departure and in
    //Destination
    @Id
    @GeneratedValue
    protected int id;

    @ManyToOne
    protected Airport airport;

    public Destination() {
    }

    public Destination(Airport airport) {
        this.airport = airport;
    }

    public int getId() {
        return id;
    }

    public Airport getAirport() {
        return airport;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "id=" + id +
                ", airport=" + airport +
                '}';
    }
}
