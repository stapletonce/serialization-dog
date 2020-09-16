package chloedev.serialization;

import org.testng.annotations.Test;

import java.io.*;

class DogTest {

    @Test
    public void serializeDogTest() {
        Dog dog1 = new Dog();
        dog1.setName("Louie");
        dog1.setBreed("goldendoodle");
        dog1.setOwner("Chloe");
        dog1.setSex("boy");
        dog1.setBirthDate(5, 31, 2016);

        String filename = "file.csv";

        try
        {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(dog1);

            out.close();
            file.close();

        }

        catch(IOException except)
        {
            System.out.println("IOException is caught");
        }

        Dog dog2 = null;

        try
        {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            dog2 = (Dog)in.readObject();

            in.close();
            file.close();

        }

        catch(IOException | ClassNotFoundException except)
        {
            System.out.println("IOException is caught");
        }

        // assertEquals(dog1, dog2);

    }

}