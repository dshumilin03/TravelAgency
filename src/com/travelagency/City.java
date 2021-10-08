package com.travelagency;

public class City {
    private final String name;
    private final Country country;

    public City(String name, Country country) {
        if (name == null) {
            throw new NullPointerException("City is not set");
        }
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }
}