package org.Fasttrackit;

public class Rescuer {
    private String name;
    private double money;
    private String gender;
    private int age;

    public void feedAnimal(Animal animal, Petfood petfood) {

        System.out.println(this.name + "just gave some" + petfood.getName() + "food to" + animal.getName());
    }

    public void recreateAnimal (Rescuer rescuer, Recreation recreation, Animal animal) {
        System.out.println(this.name + recreation.getName() + animal.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
