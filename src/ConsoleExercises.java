import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is %f%n", pi );
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.println("Gimme 3 words please: ");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//        System.out.printf("Baby's first word: %s\n", wordOne);
//        System.out.printf("Baby's second word: %s\n", wordTwo);
//        System.out.printf("Baby's third word: %s\n", wordThree);

        System.out.print("Lemme catch two numbers amigo: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("%s\n * %s\n", num1, num2);

    }
}
