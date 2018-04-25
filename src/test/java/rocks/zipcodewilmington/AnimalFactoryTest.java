package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)` --- DONE - JoJo
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)` -- DEPENDS ON DOG TEST


    @Test
    public void createDogTest(){
        // Given (We make a dog it gets an ID)
        String dogName = "";
        Date birthDate = new Date();
        int givenDogID = AnimalFactory.createDog(dogName, birthDate).getId();

        // When (we retrieve ID )
        int retrieveDogID = DogHouse.getNumberOfDogs();

        // Then (we expect ID to match dog we made)
        Assert.assertEquals(givenDogID, retrieveDogID );
    }

    @Test
    public void createCatTest(){
        // Given (We make a dog it gets an ID)
        String dogName = "";
        Date birthDate = new Date();
        int givenCatID = AnimalFactory.createCat(dogName, birthDate).getId();

        // When (we retrieve ID )
        int retrieveCatID = CatHouse.getNumberOfCats();

        // Then (we expect ID to match dog we made)
        Assert.assertEquals(givenCatID, retrieveCatID );
    }


}
