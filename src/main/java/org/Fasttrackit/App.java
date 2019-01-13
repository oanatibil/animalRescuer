package org.Fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        App.rescuerFeedAnimal();



    }
    // Homework no 4 - FeedAnimal
    static void rescuerFeedAnimal() {
        System.out.println("Entering method rescuerFeedAnimal .");


        System.out.println( "Hello World!" );
        Animal animal = new Animal("Chaika");
        animal.setAge(3);
        animal.setFavActivity("running");
        animal.setFavFood("meat");
        animal.setHealth(10);
        animal.setHunger(1);
        animal.setSpirit(10);

        Petfood petfood = new Petfood();
        petfood.setexpirationDate();
        petfood.setname("Purina");
        petfood.setprice(2.5);
        petfood.setquantity (1.2);
        petfood.setoriginCountry("Germany");
        petfood.setdailyPortion(1.2);
        petfood.setingredients ("a,b,c");
        petfood.setbioFood(true);

        Rescuer rescuer = new Rescuer();
        rescuer.setAge(30);
        rescuer.setGender("f");
        rescuer.setName("John");
        rescuer.setMoney(100.5);

        rescuer.feedAnimal(animal, petfood);
        Recreation recreation  = new Recreation();
        rescuer.recreateAnimal(rescuer, recreation, animal);



        System.out.println("");
        System.out.println(animal.getName());
    }
}

