/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chloedev.serialization;

import java.io.*;

/**
 *
 * @author ces
 */
public class DogDriver {
    
    public static void main(String[] args) throws IOException {
        Dog dog1 = new Dog();
        dog1.setName("Louie");
        dog1.setBreed("goldendoodle");
        dog1.setOwner("Chloe");
        dog1.setSex("boy");
        dog1.setBirthDate(05, 31, 2016);
        
        // System.out.println(dog1.getName());
        
        String filename = "file.csv";

        dog1.serializeToCSV(dog1);

        dog1.deserializeFromCSV();
          

    }
    
}
