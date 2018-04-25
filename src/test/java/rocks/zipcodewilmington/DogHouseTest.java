package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate); //THIS IS WHERE FIRST CREATE DOG WAS BEIN USED I NOT CEZY
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        int expectedDogs = 1;

        // Then
        int retrieveDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogs, retrieveDogs);
        //NEEDS AN ASSERT EQUALS OR ALWAYS TRUE BY DEFAULT
        //WHY DO WE NEED A CLEAR AND ADD TO TEST NUMBER OF DOGS
    }



    @Test
    public void addDogTest() {

        // Given (I have a dog)
        Date birthDay = new Date();
        Dog dog = new Dog("Cat", birthDay, 0);
        DogHouse.clear();

        // When (When I add the dog to DogHouse and get ID)
        DogHouse.add(dog);

        // Then (I expect to see his ID showing he was added to DogHouse
        Dog retrieveID = DogHouse.getDogById(0);
        Assert.assertEquals(dog, retrieveID);
    }


    @Test
    public void removeDogByIdTest() {

        // Given (I have a bunch of Dogs)
        Dog doggo = new Dog("Stitch", null, 0);
        Dog doggoTwo = new Dog("NaNaN", null, 1);
        Dog doggoThree = new Dog("Gheyzor", null, 2);

        DogHouse.clear();
        DogHouse.add(doggo);
        DogHouse.add(doggoTwo);
        DogHouse.add(doggoThree);


        // When (When I remove a dog  and try to get ID)
        DogHouse.getDogById(2);
        DogHouse.remove(2);

        Dog expected = null;
        Dog dogAfter = DogHouse.getDogById(2);

        // Then (I expect to see ID is null showing hes removed)

        Assert.assertEquals(expected, dogAfter);
    }

    @Test
    public void removeDogByDogTest() {

        // Given (I have dogs added to DogHouse)
        Dog doggo = new Dog("Stitch", null, 0);
        Dog doggoTwo = new Dog("NaNaN", null, 1);
        Dog doggoThree = new Dog("Gheyzor", null, 2);

        DogHouse.clear();
        DogHouse.add(doggo);
        DogHouse.add(doggoTwo);
        DogHouse.add(doggoThree);

        // When (When I remove a dog by reference Variable and get ID)
        DogHouse.remove(doggo);

        Dog expected = null;
        Dog retrieveDog = DogHouse.getDogById(0);

        // Then (I expect to see his ID showing null he was removed from DogHouse)
        Assert.assertEquals(expected, retrieveDog);
    }

    @Test
    public void getDogByIdTest() {

        // Given (I have dogs)
        Dog doggo = new Dog("Stitch", null, 0);
        Dog doggoTwo = new Dog("NaNaN", null, 1);
        Dog doggoThree = new Dog("Gheyzor", null, 2);

        DogHouse.clear();
        DogHouse.add(doggo);
        DogHouse.add(doggoTwo);
        DogHouse.add(doggoThree);

        // When (When I get the dogs reference variable and ID)
        String expected = String.valueOf(doggo);
        String retrieveDog = String.valueOf(DogHouse.getDogById(0));

        // Then (I expect them to match)
        Assert.assertEquals(expected, retrieveDog);
    }

}
