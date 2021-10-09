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
        User user1 = createUser("myLogin", "myPassword");
        Integer[] user1Birthday = new Integer[]{27, 4, 2003};
        user1.addInfo("Ivan","Ivanov","example@mail.com", user1Birthday);
        user1.setBalance(500);
        user1.setToursCompleted(5);
        System.out.println(user1.getInfo());
        System.out.printf("Login: %s\nPassword: %s", user1.getLogin(), user1.getPassword());
    }
    static Tour createTour(City city, BigDecimal price) {
        return new Tour(city, price);
    }

    static User createUser(String login, String password) {
        return  new User(login, password);
    }

}
