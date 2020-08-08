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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import org.testng.annotations.Test;

public class Dog implements Serializable {
    private String name;
    private String owner;
    private String breed;
    private String sex;
    LocalDate birthdate;
    
    public Dog() {
        // constructor
    }

    public String toString() {
        return name + " - " + breed + " - " + owner;
    }

    public boolean equals(Dog otherDog) {
        System.out.println(this);
        System.out.println(otherDog);
        if (!(name.equals(otherDog.getName()))) {
            return false;
        }
        if (!(owner.equals(otherDog.getOwner()))) {
            return false;
        }
        if (!(breed.equals(otherDog.getBreed()))) {
            return false;
        }
        if (!(sex.equals(otherDog.getSex()))) {
            return false;
        }
        if (!(birthdate.equals(otherDog.getBirthDate()))) {
            return false;
        }
        return true;
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
    
    public void setBirthDate(String date) {
        LocalDate newBirthDate = LocalDate.parse(date);
        this.birthdate = newBirthDate;
    }

}
