package org.Fasttrackit;

public class Animal {
    protected String name;
    private int age;
    private int health;
    private int hunger;
    protected int spirit;
    private String favFood;
    private String favActivity;

    public Animal(String name) {
        this.name = name;
        System.out.println("in animal constructor " + name);
    }

    public void showAnimalSpirit ( ){

        System.out.println(" From 0 to 10 the animal has the following state of mind:" + this.spirit );

    }
    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getFavActivity() {
        return favActivity;
    }

    public void setFavActivity(String favActivity) {
        this.favActivity = favActivity;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
