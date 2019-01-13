package org.Fasttrackit;

public class Dog extends Animal {
    boolean trained;

    public Dog(String name) {
        super(name);
        System.out.println("in dog contructor" + name);
    }

    public void showAnimalSpirit() {
        if (spirit > 5) {
            System.out.println(this.name + "shakes its tail because it is happy :)");
        } else {
            System.out.println(this.name + "is not feeling so good!");
        }

    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
}
