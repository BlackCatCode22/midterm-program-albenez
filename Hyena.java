import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.sql.SQLOutput;

public class Hyena extends Animal{

    private static int numOfHyena = 0;

    private static List<String> myListOfHyenaNames = new ArrayList<>();

    public static int getNumOfHyena() {return numOfHyena;}
    public Hyena() {
        System.out.println("\n A new Hyena was created!");
        numOfHyena++;
    }
    // create a method that input hyena names from a file named animalNames.txt
    public static void inputHyenaNames() {

        String filepath = "C:\\Animals\\animalNames.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filepath));
            Scanner scanner = new Scanner(System.in)) {

            String line;
            int lineNum = 1;
            while ((line = fileReader.readLine()) != null) {
                if (lineNum == 3) {
                    String[] values = line.split(",");
                    for (String value : values) {
                        myListOfHyenaNames.add(value.trim());
                    }
                }
                lineNum++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // write java code to separate one time of the input file on comma
        // use split() string method
    }

        public static void listOut() {
        for (String name : myListOfHyenaNames) {
            System.out.println(name);
        }
        }


        public static String popHyenaName(){
        //remove the frist element from the ArraayList
            String removedHyenaName = "";
            if (!myListOfHyenaNames.isEmpty()) {
                removedHyenaName = myListOfHyenaNames.remove(0);
            }else {
                System.out.println("the ArrayList is empty. nothing to remove.");
            }
            return removedHyenaName;
        }
    String theNewID = Main_2.genUniqueID("hyena", 8);

}
