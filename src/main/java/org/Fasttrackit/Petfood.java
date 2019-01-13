package org.Fasttrackit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Petfood {
   private String name;
   private double price;
    private double quantity;
LocalDate expirationDate;
private String originCountry;
private double dailyPortion;
private String ingredients;
private boolean bioFood;

    public void setexpirationDate() {
        this.expirationDate = expirationDate;
    }

    public void setname(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setprice(double price) {
        this.price = price;
        System.out.println( price + "RON");
    }
    public void setquantity (double quantity){
        this.quantity = quantity;
        System.out.println(quantity + "kg");
    }

    public void setoriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void setdailyPortion(double dailyPortion) {

        this.dailyPortion = dailyPortion;
        System.out.println(dailyPortion + "g");}

    public void setingredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setbioFood(boolean bioFood) {
        this.bioFood = bioFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public double getDailyPortion() {
        return dailyPortion;
    }

    public void setDailyPortion(double dailyPortion) {
        this.dailyPortion = dailyPortion;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isBioFood() {
        return bioFood;
    }

    public void setBioFood(boolean bioFood) {
        this.bioFood = bioFood;
    }
}
