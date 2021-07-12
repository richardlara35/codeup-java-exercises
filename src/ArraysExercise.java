import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercise {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] persons = new Person[3];
        persons[0] = new Person("Richard");
        persons[1] = new Person("Corey");
        persons[2] = new Person("Sean");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
        }
        public static String[] addPerson(){

    }
}
