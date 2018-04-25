package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)` --- DONE - JoJo
    // TODO - Create tests for `speak`    --- DONE - JoJo
    // TODO - Create tests for `setBirthDate(Date birthDate)` ---- DONE - JoJo
    // TODO - Create tests for `void eat(Food food)`     --- DONE - JoJo
    // TODO - Create tests for `Integer getId()`        --- DONE - JoJo
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`   ---  DONE - JoJo
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`   --- DONE - JoJo


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {
        // Given (that you have a dog that speaks)
        Dog dog = new Dog(null, null, null);
        String givenSpeak = "bark!";

        // When (a dog speaks we expect it to bark)
        String retrievedSpeak = dog.speak();

        // Then (we expect to get the given sound)
        Assert.assertEquals(givenSpeak, retrievedSpeak);
    }

    @Test
    public void setBirthDateTest() {
        // Given (there exists a dog with a birthDay)
        Date givenDate = new Date();
        Dog dog = new Dog(null, givenDate, null);

        // When (a dog has a birthDay we expect a birthDay)
        Date retrievedDate = dog.getBirthDate();

        // Then (we expect to get the date)
        Assert.assertEquals(givenDate, retrievedDate);
    }

    @Test
    public void eatTest() {
        //Given (there exists a dog that eats)
        Dog dog = new Dog(null, null, null);
        Food givenFood = new Food();
        int givenNumEaten = 1;

        // When(a dog eats we expect food)
        dog.eat(givenFood);//ITS VOID just write it alone
        int retrievedNumEaten = dog.getNumberOfMealsEaten();

        // Then (we expect to get their food)
        Assert.assertEquals(givenNumEaten, retrievedNumEaten);
    }

    @Test
    public void getIDTest() {

        //Given (there exists a dog that has an ID)
        int givenID = 666;
        Dog dog = new Dog(null, null, givenID);

        // When(a dog has an ID)
        int retrievedID = dog.getId();

        // Then (we expect to get their ID)
        Assert.assertEquals(givenID, retrievedID);
    }

    @Test
    public void animalInheritanceTest() {
        //Given (there exists a dog)
        Dog dog = new Dog(null, null, null); //cat is reference variable

        // When(a dog has an ID)
        boolean retrievedInstance = dog instanceof Animal;

        // Then (we expect to get their ID)
        Assert.assertTrue(retrievedInstance);
    }

    @Test
    public void mammalInheritanceTest() {
        //Given (there exists a dog)
        Dog dog = new Dog(null, null, null); //cat is reference variable

        // When(a dog has an ID)
        boolean retrievedInstance = dog instanceof Mammal;

        // Then (we expect to get their ID)
        Assert.assertTrue(retrievedInstance);
    }

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date(); // gives current date and time when you run it
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
