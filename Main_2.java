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
    }
}
