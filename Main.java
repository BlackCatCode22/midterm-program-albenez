import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.firstName = "jim";
        myStudent.lastName = "Halpert";
        myStudent.gpa = 3.0;

        Student myStudent2 = new Student();
        myStudent2.firstName = "tim";
        myStudent2.lastName = "smith";
        myStudent2.gpa = 2.6;

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(myStudent);
        studentList.add(myStudent2);

        for (Student student : studentList) {
            System.out.println("Students name is: " + student.firstName);
        }






    }
}