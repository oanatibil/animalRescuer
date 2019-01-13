package org.Fasttrackit;

public class Cat extends Animal {
String breed;
boolean hunter;
boolean indoor;

    public Cat(String name) {
        super(name);
        System.out.println(name);
    }

    public void showAnimalSpirit (){
        if (spirit>5) {
            System.out.println(this.name + "purrs because it is happy :)");
        }
        else {
            System.out.println(this.name + "is not feeling so good!");
        }

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isHunter() {
        return hunter;
    }

    public void setHunter(boolean hunter) {
        this.hunter = hunter;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }
}
