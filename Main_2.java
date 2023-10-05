import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InterruptedIOException;


public class Main_2 {

    // creating the genUniqueID method
    public static String genUniqueID(String theSpecies, int numOfSpecies) {
        String prefix = "";
        int suffix = numOfSpecies + 1;

        if (theSpecies.contains("hyena")) {
            prefix = "hy";

        }
        return prefix + Integer.valueOf(suffix);



    }

    public static void main(String[] args) {

        System.out.println("Hello world");

        Hyena myHyena = new Hyena();
        System.out.println("\n The number of Hyenas is:" + myHyena.getNumOfHyena());

        int currentNumOfHyenas = Hyena.getNumOfHyena();
        System.out.println("\n The number of hyenas is: " + currentNumOfHyenas + "\n\n");

        Hyena oneMore = new Hyena();

        oneMore.setAnimalColor("Red");

        System.out.println("\n my Hyena is " + oneMore.getAnimalColor());

        oneMore.setAnimalID("Hy09");
        System.out.println("\n The ID of one more is " + oneMore.getAnimalID());


        System.out.println(oneMore.theNewID);

        Hyena.inputHyenaNames();

        Hyena.listOut();

        String myName = Hyena.popHyenaName();
        myName = Hyena.popHyenaName();
        myName = Hyena.popHyenaName();
        System.out.println("the pop Hyena name is:" + myName);

        // do the same for each animal by coping and paste the java file Hyena.java
        // and renaming the file to animal names and input a arrayList code from github
        //
        String file = "C:\\Animals\\arrivingAnimals.txt";
        String myFileLine = "";
        try {
           BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((myFileLine = reader.readLine()) != null) {
                String[] myArray = myFileLine.split(",");

                String myStr = myArray[0];
                System.out.println("myStr = " + myStr);
                myArray = myStr.split(" ");
                String











            }




    }


}
