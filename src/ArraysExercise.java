import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercise {

    public static void main(String[] args) {
        String[] Person = {"Sean", "Corey", "Mitch"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a name");
        String userInput = scanner.next();

        System.out.println(Arrays.toString(addPerson(Person,userInput)));
    }

    public static String[] addPerson(String[] Person, String userInput){
        Person = Arrays.copyOf(Person, Person.length +1);
        Person[Person.length -1] = userInput;

        return Person;
    }
}
