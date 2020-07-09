/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// https://www.geeksforgeeks.org/serialization-in-java/
package chloedev.serialization;

/**
 *
 * @author ces
 */
import java.io.*;

public class Dog implements Serializable {
    private String name;
    private String breed;
    private Boolean male;
    private int birthyear;
    
    public String getName() {
        return name;
    } 
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getBreed() {
        return breed;
    } 
    
    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }
   
    
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Louie");
        dog1.setBreed("goldendoodle");
        dog1.male = true;
        dog1.birthyear = 2015;
        
        System.out.println(dog1.getName());
        
        String filename = "file.csv"; 
          
        try
        {    
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            out.writeObject(dog1); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Dog has been serialized :)"); 
  
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
              
            System.out.println("Dog has been deserialized "); 
            System.out.println("breed = " + dog2.getBreed()); 
            System.out.println("name = " + dog2.getName()); 
        } 
          
        catch(IOException except) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException except) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
    } 
} 
