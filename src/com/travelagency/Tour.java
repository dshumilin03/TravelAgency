package com.travelagency;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Tour {
    final private City city;
    final private Country country;
    final private BigDecimal price;

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


    public City getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public BigDecimal getPrice() {
        return price;
    }
    @Override
    public String toString() {
        DecimalFormat moneyformat = new DecimalFormat("$0.00");
        return String.format("Here is a trip to %s, %s, for %s!", country.getName(), city.getName(), moneyformat.format(price));
    }
}
