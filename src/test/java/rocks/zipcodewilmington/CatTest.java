package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)` --- DONE - JoJo
    // TODO - Create tests for `speak`  --- DONE JoJo
    // TODO - Create tests for `setBirthDate(Date birthDate)` --- DONE - JoJo
    // TODO - Create tests for `void eat(Food food)`  ---- DONE - JoJo
    // TODO - Create tests for `Integer getId()`  ---- DONE - JoJo
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword` ----- DONE JoJo
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword` ----- DONE JoJo

    @Test
    public void setNameTest() {
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "FrostIron";

        // When (a cat's name is set to the given name) -- called from mammal class
        cat.setName(givenName);

        // Then (we expect to get the given name from the cat)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void speakTest() {
        // Given (that you have a cat that speaks)
       Cat cat = new Cat(null, null, null);
       String givenSpeak = "meow!";

        // When (a cat speaks we expect it to meow)
        String retrievedSpeak = cat.speak();

        // Then (we expect to get the given sound)
        Assert.assertEquals(givenSpeak, retrievedSpeak);
    }


    @Test
    public void setBirthDateTest() {
        // Given (there exists a cat with a birthDay)
        Date givenDate = new Date();
        Cat cat = new Cat(null, givenDate, null);

        // When (a cat has a birthDay we expect a birthDay)
        Date retrievedDate = cat.getBirthDate();

        // Then (we expect to get the date)
        Assert.assertEquals(givenDate, retrievedDate);
    }

    @Test
    public void eatTest(){
        //Given (there exists a cat that eats)
        Cat cat = new Cat(null, null, null);
        Food givenFood = new Food();
        int givenNumEaten = cat.getNumberOfMealsEaten();

        // When(a cat eats we expect food)
        cat.eat(givenFood); //ITS VOID just write it alone
        int retrievedNumEaten = cat.getNumberOfMealsEaten();

        // Then (we expect to get their food)
        Assert.assertEquals(givenNumEaten + 1, retrievedNumEaten);
    }

    @Test
    public void getIDTest() {

        //Given (there exists a cat that has an ID)
        int givenID = 666;
        Cat cat = new Cat(null, null, givenID);

        // When(a cat has an ID)
        int retrievedID = cat.getId();

        // Then (we expect to get their ID)
        Assert.assertEquals(givenID, retrievedID);
    }


    @Test
    public void animalInheritanceTest() {
        //Given (there exists a cat)
        Cat cat = new Cat(null, null, null); //cat is reference variable

        // When(a cat has an ID)
        boolean retrievedInstance = cat instanceof Animal;

        // Then (we expect to get their ID)
        Assert.assertEquals(true, retrievedInstance);
    }

    @Test
    public void mammalInheritanceTest() {
        //Given (there exists a cat)
        Cat cat = new Cat(null, null, null); //cat is reference variable

        // When(a cat has an ID)
        boolean retrievedInstance = cat instanceof Mammal;

        // Then (we expect to get their ID)
        Assert.assertEquals(true, retrievedInstance);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date(); // gives current date and time when you run it
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
