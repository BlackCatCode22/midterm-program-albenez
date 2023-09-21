//AB 9/21/23
//main.java
//inheritance for zoo warmup

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // How many Animals do you have
        System.out.println("\n Before we used 'new'... we have " + Animal.numAnimals + " Animals");

        // Create new Hyena
        Hyena myHyena = new Hyena();

        Hyena myHyena02 = new Hyena();
        Hyena myHyena03 = new Hyena();
        // how many hyenas do we have
        System.out.println(" we have " + Hyena.numOfHyena + " Hyenas");

        // Give Hyena a name
        myHyena.name = "bud";

        System.out.println("\n my Hyena's name is: " + myHyena.name);
        System.out.println("He make this sound:" + myHyena.makeNoise02());

        // create an animal object
        Animal myNewAnimal = new Animal();

        System.out.println("\n After we used 'new'... we have " + Animal.numAnimals + " Animals");
       // myNewAnimal.desc = " this is my description";

        //System.out.println("\n the desc of the new animal is: " + myNewAnimal.desc);
       // System.out.println("\n");




        // open the arriving animals file

        /*
        String file = "c://Animals//arrivingAnimals.txt";

        ArrayList<Animal> animalList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("c://Animals//arrivingAnimals.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            //create an array list


            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line); // Print each line from the file
                //split the line into 6 substring
                String[] myArray = line.split(",");
                //System.out.println("\n my Array [0] is " + myArray[0]);
                //System.out.println("\n my Array [1] is " + myArray[1]);

                // create an animal object
                Animal anyAnimal = new Animal();
                // Increment the static animal count


                // fill the object's data fields
                anyAnimal.desc = myArray[0];
                anyAnimal.brithSeason = myArray[1];
                anyAnimal.color = myArray[2];
                anyAnimal.weight = myArray[3];
                anyAnimal.origin01 = myArray[4];
                anyAnimal.origin02 = myArray[5];

                // add the newly created animal object to the array list
                animalList.add(anyAnimal);

            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // done with the txt file
        // output the arrayList
        for (Animal animals: animalList) {
            System.out.println(animals.desc);
            System.out.println(animals.brithSeason);
            System.out.println(animals.color);
            System.out.println(animals.weight);
            System.out.println(animals.origin01);
            System.out.println(animals.origin02);
            System.out.println("\n");

        }


         */


    }
}