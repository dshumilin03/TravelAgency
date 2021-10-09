package com.travelagency;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class User {
    private final String login;
    private String password;
    private String name;
    private String surname;
    private String mail;
    private Integer[] birthday = new Integer[3];
    private BigDecimal balance = BigDecimal.valueOf(0);
    private int ToursCompleted = 0;
    private final List<String> reviews = new ArrayList<String>();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changeMail(String mail) {
        this.mail = mail;
    }

    public void addInfo(String name, String surname, String mail, Integer[] birthday) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.birthday = birthday;
    }

    public String getInfo() {
        DecimalFormat moneyformat = new DecimalFormat("$0.00");
        return "Name: %s\nSurname: %s\nMail: %s\nBalance: %s\nTours completed: %d\nDate of birth: %s.0%s.%s".formatted(
                this.surname,
                this.name,
                this.mail,
                moneyformat.format(this.balance),
                this.ToursCompleted,
                this.birthday[0],
                this.birthday[1],
                this.birthday[2]);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public int getToursCompleted() {
        return ToursCompleted;
    }

    public Integer[] getBirthday() {
        return birthday;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public String getLogin() {
        return login;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getSurname() {
        return surname;
    }

    public void setBalance(int balance) {
        this.balance = BigDecimal.valueOf(balance);
    }

    public void setToursCompleted(int toursCompleted) {
        ToursCompleted = toursCompleted;
    }

    public void setReviews(String review) {
        this.reviews.add(review);
    }
}
