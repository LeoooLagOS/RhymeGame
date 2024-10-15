import java.util.Scanner;

public class RhymeGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String animal;
        animal = getAnimal(in);

        if (rhymingAnimal(animal))
            System.out.println("This animal rhymes with cat");
        else
            System.out.println("This animal doesn't rhyme with cat");
        in.close();
    }

    private static boolean rhymingAnimal(String animal) {
        return animal.matches("[a-zA-Z](at|AT)");
    }

    private static String getAnimal(Scanner in) {
        System.out.println("Please enter the name of the animal: ");
        return in.nextLine();
    }
}