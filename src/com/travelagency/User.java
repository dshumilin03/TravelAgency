package com.travelagency;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class User {
    private final String login;
    private String password;
    private String name;
    private String surname;
    private String mail;
    private Integer[] birthday = new Integer[3];
    private BigDecimal balance;
    private int ToursCompleted;
    private List<String> reviews = new ArrayList<String>();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
