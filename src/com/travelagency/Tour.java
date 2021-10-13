package com.travelagency;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Tour {
    private final City city;
    private final Country country;
    private final BigDecimal price;
    private BigDecimal rating;
    private double ratingSum;
    private int reviewsCount = 0;

    public Tour (City city, BigDecimal price) {
        if (city == null) {
            throw new NullPointerException("City is not set");
        } else if (price == null) {
            throw new NullPointerException("Price is not set");
        } else {
            this.city = city;
            this.country = city.getCountry();
            this.price = price;
        }

    }

    public BigDecimal getRating() {
        return rating;
    }

    public void addRating(double rating) {
        this.reviewsCount++;
        this.ratingSum += rating;
        this.rating = BigDecimal.valueOf(ratingSum).divide(BigDecimal.valueOf(reviewsCount), RoundingMode.DOWN);
    }

    public City getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String info() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        return String.format("Here is a trip to %s, %s, for %s!", country.getName(), city.getName(), currencyFormatter.format(price));
    }

}
