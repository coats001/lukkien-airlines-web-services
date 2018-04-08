package com.amos.lukkien.airlineapp.model;

import javax.persistence.*;
import java.util.Set;

/**
 * For now we will have just one airline
 * bit future and past compatiblity we added this abstraction
 */
@Entity
@Table
public class AirplaneCompany {
    public AirplaneCompany() {
    }

    public AirplaneCompany(String name, Set<Flight> flights) {
        this.name = name;
        this.flights = flights;
    }

    @Id
    @GeneratedValue
    protected int id;
    @Column
    protected String name;

    @OneToMany
    protected Set<Flight> flights;


    public String getName() {
        return name;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AirplaneCompany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flights=" + flights +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirplaneCompany)) return false;

        AirplaneCompany that = (AirplaneCompany) o;

        if (getId() != that.getId()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getFlights() != null ? getFlights().equals(that.getFlights()) : that.getFlights() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getFlights() != null ? getFlights().hashCode() : 0);
        return result;
    }
}
