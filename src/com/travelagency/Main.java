package com.travelagency;

import java.math.BigDecimal;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Country russia = new Country("Russia");
        City moscow = new City("Moscow", russia);

        Tour tour1 = createTour(moscow, BigDecimal.valueOf(5000));
        System.out.println(tour1.info());
        Tour tour2 = createTour(moscow, BigDecimal.valueOf(5000));
        System.out.println(tour2.info());
        tour2.addRating(5);
        tour2.addRating(3);
        tour2.addRating(5);
        tour2.addRating(5);
        tour2.addRating(5);


    }
    static Tour createTour(City city, BigDecimal price) {
        return new Tour(city, price);
    }
}