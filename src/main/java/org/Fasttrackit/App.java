package org.Fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Animal animal = new Cat("Dexter");
        animal.setAge(2);
        animal.setFavActivity("running");
        animal.setFavFood("meat");
        animal.setHealth(10);
        animal.setHunger(1);
        animal.setSpirit(10);

        Petfood petfood = new Petfood();
        Rescuer rescuer = new Rescuer();
        rescuer.feedAnimal(animal, petfood);


        System.out.println(animal.getName());
    }
}
