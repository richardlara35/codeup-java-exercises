import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is %.2f%n", pi );
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
//        scanner.useDelimiter(".");
//        System.out.println("Please enter a sentence: ");
//
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);
        System.out.print("Lemme catch two numbers amigo: ");
        float length = Float.parseFloat(scanner.nextLine());
        float width = Float.parseFloat(scanner.nextLine());

        System.out.printf("Perimeter: %s\n", (2 * length) + (2 * width));
        System.out.printf("Area: %s", length * width);

    }
}
