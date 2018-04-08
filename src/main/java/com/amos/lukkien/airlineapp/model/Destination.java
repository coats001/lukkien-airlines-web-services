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
}
