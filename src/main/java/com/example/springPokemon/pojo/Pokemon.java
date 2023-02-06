package com.example.springPokemon.pojo;

import java.util.List;

public class Pokemon {
    private Long id;
    private String surname;
    private List<Capacite> capacitesList;

    public Pokemon(Long id, String surname, List<Capacite> capacitesList) {
        this.id = id;
        this.surname = surname;
        this.capacitesList = capacitesList;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Capacite> getCapacites() {
        return this.capacitesList;
    }

    public void setCapacites(List<Capacite> capacites) {
        this.capacitesList = capacites;
    }

}
