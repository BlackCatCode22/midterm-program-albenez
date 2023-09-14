public class Cat {

    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    String name;
    int age;
    String catSound;

    int livesRemaining;

    public void meow (){
        System.out.println("Meow" + catSound);
    }
    public Cat () {
        catCount++;
        livesRemaining = MAX_LIVES;
    }

    public static int getCatCount(){
        return catCount;

    }
    public Cat(String name) {
        this.name = "Not named";
    }
}
