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
}
