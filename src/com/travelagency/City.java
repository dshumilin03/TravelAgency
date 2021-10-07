package com.travelagency;

public class City {
    private String name;
    private Country countryName;

    public City(String name, Country countryName) {
        setName(name);
        setCountryName(countryName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryName(Country countryName) {
        this.countryName = countryName;
    }

    public Country getCountryName() {
        return countryName;
    }
}
