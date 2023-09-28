import java.util.Date;

public class Animal {
    private String animalID;
  private String animalName;

    private Date animalBrithDate;
    private String animalColor;
    private char animalGender;
    private float animalWeight;
    private String arrivingFrom;

    // Animal getters and setters
    public String getAnimalID() {
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Date getAnimalBrithDate() {
        return animalBrithDate;
    }

    public void setAnimalBrithDate(Date animalBrithDate) {
        this.animalBrithDate = animalBrithDate;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public char getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(char animalGender) {
        this.animalGender = animalGender;
    }

    public float getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(float animalWeight) {
        this.animalWeight = animalWeight;
    }

    public String getArrivingFrom() {
        return arrivingFrom;
    }

    public void setArrivingFrom(String arrivingFrom) {
        this.arrivingFrom = arrivingFrom;
    }




    private static int numOfAnimal = 0;

    public int getNumOfAnimals() {
        return numOfAnimal;
    }

    public Animal() {
        System.out.println("\n a new animal was created!");
        numOfAnimal++;
    }

}
