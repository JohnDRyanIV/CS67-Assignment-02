import java.util.Scanner;

public class AnimalDriver {

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
