package chloedev.serialization;

import org.junit.Before;
import org.testng.annotations.Test;

import java.io.*;

import static chloedev.serialization.BinSerialization.deserializeBinary;
import static chloedev.serialization.BinSerialization.serializeBinary;
import static org.junit.Assert.assertEquals;

class DogTest {

    Dog dog1 = new Dog();
    String csvfilename = "csvtest.csv";
    String binfilename = "bintest.ser";

    @Before
    public void setUp() {
        dog1.setName("Louie");
        dog1.setBreed("goldendoodle");
        dog1.setOwner("Chloe");
        dog1.setSex("boy");
        dog1.setBirthDate(5, 31, 2016);

    }

    @Test
    public void goodBin() throws IOException, ClassNotFoundException {

        serializeBinary(dog1, binfilename);
        Dog dog2 = (Dog) deserializeBinary(dog1, binfilename);

        assertEquals(dog1, dog2);

    }

}