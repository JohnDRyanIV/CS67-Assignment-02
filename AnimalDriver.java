import java.util.Scanner;
import java.util.ArrayList;

public class AnimalDriver {

    public static void showAllFromExhibit(String exhibit, ArrayList<Animal> animals) {
        ArrayList<Animal> inExhibit = new ArrayList<>();

        for(int i = 0; i < animals.size(); i++) {
            if (exhibit.equals(animals.get(i).getExhibit())) {
                inExhibit.add(animals.get(i));
            }
        }

        for(int i = 0; i < inExhibit.size(); i++) {
            System.out.println(inExhibit.get(i).toString());
        }


    }

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> species = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        
        ArrayList<String> exhibit = new ArrayList<>();

        ArrayList<Animal> animals = new ArrayList<>();

        final int numAnimals = 4;

        Scanner in = new Scanner(System.in);

        // Obtaining input for name, gender, species, and age
        for(int i = 0; i < numAnimals; i++) {

            System.out.print("Enter the name of animal " + Integer.toString(i+1) + ": ");
            name.add(in.nextLine());

            System.out.print("Enter the species of animal " + Integer.toString(i+1) + ": ");
            species.add(in.nextLine());

            System.out.print("Enter the exhibit for animal " + Integer.toString(i+1) + ": ");
            exhibit.add(in.nextLine());

            System.out.print("Enter the age of animal " + Integer.toString(i+1) + ": ");
            age.add(in.nextInt());

            in.nextLine();

            System.out.println("==================");
        }
        
        for(int i = 0; i < numAnimals; i++) {
            animals.add(new Animal(species.get(i), name.get(i), age.get(i), exhibit.get(i)));
            System.out.println(animals.get(i).toString());
        }

        String sentinel = "end";
        String temp = "";

        /** Testing
        animals.add(new Animal("Lion", "Jeb", 5, "Savannah"));
        animals.add(new Animal("Tiger", "Jeff", 5, "Savannah"));
        //animals.add(new Animal("a", "a", 5, "base"));
        //animals.add(new Animal("a", "a", 5, "base"));
        */

        do {
            System.out.print("Enter the name of an exhibit to see the animals in that exhibit, or enter 'end' to end the program: ");
            temp = in.nextLine();
            if(!temp.equals(sentinel))
            {
                showAllFromExhibit(temp, animals);
            }

        } while(!temp.equals(sentinel));

        in.close();
    }
    
}
