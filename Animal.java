/**
 * John Ryan
 * Assignment 2
 * CS-67
 */


import java.util.Scanner;
/**
 * This class represents an animal. There is a species, name, gender, and age
 * associated with the animal. There is a toString method that returns a
 * human-legible message regarding the animal.
 */
public class Animal {

    private String species;
    private String gender;
    private String name;
    private int age;

    private String exhibit;

    /**
     * @param s = species of the animal
     * @param g = gender of animal
     * @param n = name of animal
     * @param a = age of animal
     * @param e = Exhibit animal is in
     */
    
    public Animal(String s, String n, int a, String e)
    {
        setSpecies(s);
        setName(n);
        setAge(a);
        setExhibit(e);
    }

    public Animal(String s, String n, int a)
    {
        setSpecies(s);
        setName(n);
        setAge(a);
        setExhibit("none");
    }

    /* To String */

    public String toString() {
        String message = "";
        message += getName() + " is a " + Integer.toString(getAge()) + " year old " + getSpecies() + " in exhibit " + getExhibit() + "!";
        return message;
    }

    /* Getters / Setters */

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public int getAge() { 
        return this.age;
    }

    public String getExhibit() {
        return this.exhibit;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setSpecies(String s) {
        this.species = s;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setExhibit(String e) {
        this.exhibit = e;
    }

    
}
