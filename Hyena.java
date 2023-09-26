import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Hyena extends Animal{
    private static int numOfHyena = 0;

    public Hyena() {
        System.out.println("\n A new Hyena was created!");
        numOfHyena++;
    }
    // create a method that input hyena names from a file named animalNames.txt
    public static void inputHyenaNames() {
        String filepath = "c\\Animals\\animalNames.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filepath)));
            Scanner scanner = new Scanner(System.in)) {

            String line; 

        }


                // write java code to separate one time of the input file on comma
        // use split() string method
    }

    public int getNumOfHyena() {
        return numOfHyena;
    }

}
