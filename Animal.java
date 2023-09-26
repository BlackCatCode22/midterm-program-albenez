public class Animal {
    private static int numOfAnimal = 0;

    public int getNumOfAnimals() {
        return numOfAnimal;
    }
    public Animal() {
        System.out.println("\n a new animal was created!");
        numOfAnimal++;
    }
}
