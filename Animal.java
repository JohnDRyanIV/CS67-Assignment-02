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

    /**
     * @param s = species of the animal
     * @param g = gender of animal
     * @param n = name of animal
     * @param a = age of animal
     */
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
        String[] name = {"", ""};
        String[] gender = {"", ""};
        String[] species = {"", ""};
        int[] age = {-1, -1};

        Scanner in = new Scanner(System.in);


        // Obtaining input for name, gender, species, and age
        for(int i = 0; i <= 1; i++) {

            System.out.print("Enter the name of animal " + Integer.toString(i+1) + ": ");
            name[i] = in.nextLine();

            System.out.print("Enter the gender of animal " + Integer.toString(i+1) + ": ");
            gender[i] = in.nextLine();

            System.out.print("Enter the species of animal " + Integer.toString(i+1) + ": ");
            species[i] = in.nextLine();

            // rudimentary input validation
            do {
                System.out.print("Enter the age of animal " + Integer.toString(i+1) + ": ");
                age[i] = in.nextInt();
                if(age[i] <= 0) {
                    System.out.println("Invalid entry! Age should be a positive integer!");
                }
            } while(age[i] <= 0);

            in.nextLine();
            System.out.println("==================");
        }
        
        Animal[] all = new Animal[2];
        for(int i = 0; i <=1; i++) {
            all[i] = new Animal(species[i], gender[i], name[i], age[i]);
            System.out.println(all[i].toString());
        }

        in.close();
    }
}
