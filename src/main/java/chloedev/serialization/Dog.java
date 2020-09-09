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
import groovy.transform.ASTTest;

import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import org.testng.annotations.Test;
import java.nio.charset.Charset;


public class Dog implements Serializable, Comparable<Dog> {
    private String name;
    private String owner;
    private String breed;
    private String sex;
    LocalDate birthdate;

    public Dog() {
       this.name = null;
       this.breed = null;
       this.breed = null;
       this.sex = null;
       this.birthdate = null;
    }

    public Dog(String name, String owner, String breed, String sex, int month, int day, int year) {
        this.setName(name);
        this.setOwner(owner);
        this.setBreed(breed);
        this.setSex(sex);
        this.setBirthDate(year, month, day);
    }


    public String prettyPrint() {
        return name + " - " + breed + " - " + owner;
    }

    public int compareTo(Dog otherDog) {
        //  TODO
        return 0;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);

        return result;
    }

    public boolean equals(Dog otherDog) {
        System.out.println(this.hashCode());
        System.out.println(otherDog.hashCode());

        Boolean passed = false;

        int ret = 0;
        if (this.hashCode() == otherDog.hashCode() && (name.equals(otherDog.getName()))) {
            ret++;
        }
        if (this.hashCode() == otherDog.hashCode() && (owner.equals(otherDog.getOwner()))) {
            ret++;
        }
        if (this.hashCode() == otherDog.hashCode() && (breed.equals(otherDog.getBreed()))) {
            ret++;
        }
        if (this.hashCode() == otherDog.hashCode() && (sex.equals(otherDog.getSex()))) {
            ret++;
        }
        if (this.hashCode() == otherDog.hashCode() &&(birthdate.equals(otherDog.getBirthDate()))) {
            ret++;
        }
        if (ret == 5) {
            passed = true;
        }

        return passed;
    }

    public String getName() {
        return name;
    } 
    
    public void setName(String newName) {
        this.name = newName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public String getBreed() {
        return breed;
    } 
    
    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }
    
    public String getSex() {
        return sex;
    } 
    
    public void setSex(String newSex) {
        this.sex = newSex;
   
    }

    public LocalDate getBirthDate() {
        return birthdate;
    }
    
    public void setBirthDate(int month, int day, int year) {
        LocalDate newBirthDate = LocalDate.of(year, month, day);
        this.birthdate = newBirthDate;
    }

    public void serialize() throws IOException {

        // Path currentDir = Paths.get(".");
        // Path fullPath = currentDir.toAbsolutePath();
        // Path one = currentDir.resolve("file.csv");
        // Path fileName = one.getFileName();

        // Files.newBufferedWriter(fileName);

        // Charset charset = StandardCharsets.UTF_8;

        PrintWriter outputWriter = new PrintWriter("file2.csv","UTF-8");
        outputWriter.write(this.name + ", ");
        outputWriter.write(this.breed + ", ");
        outputWriter.write(this.sex + ", ");
        outputWriter.write(this.birthdate + ", ");

        System.out.println("hey");

    }

    public void deserialize(Dog dog) {

    }

}
