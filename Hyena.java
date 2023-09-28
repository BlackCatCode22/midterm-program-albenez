import org.w3c.dom.ls.LSOutput;

public class Hyena extends Animal{


    private static int numOfHyena = 0;

public Hyena() {
    System.out.println("\n A new Hyena was created!");
    numOfHyena++;
}

    public static int getNumOfHyena() {
        return numOfHyena;
    }
    // create an ID for new animal
    String theNewID = Main_2.genUniqueID("hyena", 8);



}
