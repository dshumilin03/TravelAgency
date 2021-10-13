package com.travelagency;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class User {
    private final String login;
    private String password;
    private String name;
    private String surname;
    private String mail;
    private LocalDate birthday;
    private BigDecimal balance = BigDecimal.valueOf(0);
    private int toursCompleted = 0;
    private final List<String> reviews = new ArrayList<String>();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void addInfo(String name, String surname, String mail, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.birthday = birthday;
    }

    public String getInfo() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        return "Name: %s\nSurname: %s\nMail: %s\nBalance: %s\nTours completed: %d\nDate of birth: %s".formatted(
                this.surname,
                this.name,
                this.mail,
                currencyFormatter.format(this.balance),
                this.toursCompleted, birthday);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public int getToursCompleted() {
        return toursCompleted;
    }

    public LocalDate getBirthday() {
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

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setToursCompleted(int toursCompleted) {
        this.toursCompleted = toursCompleted;
    }

    public void setReviews(String review) {
        this.reviews.add(review);
    }
}
