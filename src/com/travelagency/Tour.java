package com.travelagency;
import java.math.BigDecimal;

public class Tour {
    private City city;
    private Country country;
    private BigDecimal price;

    public Tour (City city, Country country, BigDecimal price) {
        setCity(city);
        setCountry(country);
        setPrice(price);
    }

    protected void setCity(City city) {
        this.city = city;
    }

    protected void setCountry(Country country) {
        this.country = country;
    }

    protected void setPrice(BigDecimal price) {
        this.price = price;
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
        return "Here is a trip to "+ getCountry().getName() + ", "+ getCity().getName() + " for "+ getPrice() +" dollars";
    }
}
