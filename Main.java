import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
       // myCat.name = "Felix";
        myCat.age = 8;
        myCat.catSound ="GGGRRR";

        Cat myCat2 = new Cat();
        //myCat2.name = "Wes";
        myCat2.age = 1;

        Cat myCat3 = new Cat();
        //myCat3.name = "den";
        myCat3.age = 5;

System.out.println(Cat.getCatCount());

        ArrayList<Cat> catList = new ArrayList<>();

        for (int i = 1; i <= 5; i++){
            Cat cat  = new Cat("Cat" + i+1);
            catList.add(cat);
        }


    }
}