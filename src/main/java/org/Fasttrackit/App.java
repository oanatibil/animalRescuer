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

        //Homework 5 (overriding)
        App.showAnimalSpirit();



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
        recreation.setDuration(10);
        recreation.setGroupActvity(true);
        recreation.setName("jogging");
        recreation.setPlace("park");
        recreation.setRecreationDate(10);
        rescuer.recreateAnimal(rescuer, recreation, animal);

Vet vet = new Vet();
vet.setAge(45);
vet.setExperience(20);
vet.setGender("M");
vet.setHomeDistance(12);
vet.setName("Arthur");
vet.setSpecialty("fhl");

        System.out.println("");
        System.out.println(animal.getName());
    }

    public static void showAnimalSpirit () {

        Animal cat = new Cat("Dexter");
        cat.setSpirit(4);

        Animal dog = new Dog("Cora");
        dog.setSpirit(9);

        cat.showAnimalSpirit();
        dog.showAnimalSpirit();

    }
    public static void createCat() {
        System.out.println( "Hello World!" );
        Animal animal = new Cat("Dexter");
        animal.setAge(3);
        animal.setFavActivity("running");
        animal.setFavFood("meat");
        animal.setHealth(10);
        animal.setHunger(1);
        animal.setSpirit(10);
    }

    public static void createDog() {
        System.out.println( "Hello World!" );
        Animal animal = new Dog("Cora");
        animal.setAge(3);
        animal.setFavActivity("running");
        animal.setFavFood("meat");
        animal.setHealth(10);
        animal.setHunger(1);
        animal.setSpirit(10);
    }

}

