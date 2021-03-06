package com.travelagency;

public class Country {
    private final String name;

    public Country(String name) {
        if (name == null) {
            throw new NullPointerException("Country is not set");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
