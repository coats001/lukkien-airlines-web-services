package com.amos.lukkien.airlineapp.model;

import javax.persistence.*;
import java.util.List;

/**
 * This class is added ios using just a String name
 * for reuse prpousied (either of past code of in future code)
 */
@Entity
@Table
public class Airport {
    public Airport() {
    }

    public Airport(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Id
    @GeneratedValue
    protected int id;

    @Column
    private String name;

    @Column
    private String code;


    @OneToMany
    private List<Destination> destinations;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
