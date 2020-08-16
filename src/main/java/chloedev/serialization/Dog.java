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

public class Dog implements Serializable, Comparable<Dog> {
    private String name;
    private String owner;
    private String breed;
    private String sex;
    LocalDate birthdate;


    public Dog() {
        this.setName(null);
        this.setOwner(null);
        this.setBreed(null);
        this.setSex(null);
        this.setBirthDate(null);
    }

    public Dog(String name, String owner, String breed, String sex, String birthdate) {
        this.setName(name);
        this.setOwner(owner);
        this.setBreed(breed);
        this.setSex(sex);
        this.setBirthDate(birthdate);
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
            return true;
        }
        else {
            return false;
        }
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
