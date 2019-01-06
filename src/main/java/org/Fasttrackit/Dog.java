package org.Fasttrackit;

public class Dog extends Animal{
    boolean trained;

    public Dog(String name) {
        super(name);
        System.out.println("in dog contructor" + name);
    }
}
