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
import java.util.Date;

public class Dog implements Serializable {
    private String name;
    private String breed;
    private String sex;
    Date birthdate =  new Date();
    
    public Dog() {
        // constructor
    }
    
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
    
    public String getSex() {
        return sex;
    } 
    
    public void setSex(String newSex) {
        this.sex = newSex;
   
    }
    
    public Date getBirthDate() {
        return birthdate;
    }
    
    public void setBirthDate(Date newBirthDate) {
        this.birthdate = newBirthDate;
    }
    
}
