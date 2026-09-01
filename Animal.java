/**
 * John Ryan
 * Assignment 2
 * CS-67
 */


import java.util.Scanner;

public class Animal {

    private String species;
    private String gender;
    private String name;
    private int age;

    public Animal(String s, String g, String n, int a)
    {
        setSpecies(s);
        setGender(g);
        setName(n);
        setAge(a);
    }

    /* To String */

    public String toString() {
        String message = "";
        message += getName() + " is a " + Integer.toString(getAge()) + " year old " + getGender() + " " + getSpecies() + "!";
        return message;
    }

    /* Getters / Setters */

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() { 
        return this.age;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setSpecies(String s) {
        this.species = s;
    }

    public void setGender(String g) {
        this.gender = g;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public static void main(String[] args) {
        String name = "";
        String gender = "";
        String species = "";
        int age = -1;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the name of the animal: ");
        name = in.nextLine();

        System.out.print("Enter the gender of the animal: ");
        gender = in.nextLine();

        System.out.print("Enter the species of the animal: ");
        species = in.nextLine();

        System.out.print("Enter the age of the animal: ");
        age = in.nextInt();

        Animal blicko = new Animal(species, gender, name, age);

        System.out.println(blicko.toString());

        in.close();
    }
}
