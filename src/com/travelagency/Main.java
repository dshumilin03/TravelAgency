package com.travelagency;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Country russia = new Country("Russia");
        City moscow = new City("Moscow", russia);

        Tour tour1 = createTour(moscow, BigDecimal.valueOf(5000));
        System.out.println(tour1);
    }
    static Tour createTour(City city, BigDecimal price) {
        return new Tour(city, price);
    }
}