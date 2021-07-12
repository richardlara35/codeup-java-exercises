import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        test();
        print();
        fizzbuzz();
        displayPowTable();
        printGrades();
    }

    private static void printGrades() {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        do {
            System.out.println("Enter your grade(0-100): ");
            int grade = sc.nextInt();
            System.out.println("Your grade is: ");
            if (60 > grade && grade > 0) {
                System.out.println("F");
            } else if (66 >= grade) {
                System.out.println("D");
            } else if (79 >= grade) {
                System.out.println("C");
            } else if (87 >= grade) {
                System.out.println("B");
            } else if (100 >= grade) {
                System.out.println("A");
            }
            System.out.println("Do you want to continue? (Y/N)?");
        } while (!userInput.equalsIgnoreCase("N"));
    }

    private static void displayPowTable() {
        Scanner sc = new Scanner(System.in);
        int intValue;
        String userInput = "";

        do {
            System.out.println("Enter an Integer number");
            intValue = sc.nextInt();
            printTable(intValue);
            System.out.println("Number: " + intValue);
            System.out.println("Would you like to continue? (Y/N)?");
            userInput = sc.next();
        } while (!userInput.equalsIgnoreCase("N"));
    }

    private static void printTable(int value) {
        System.out.println("Here is your table!");
        System.out.println(" number | squared | cubed ");
        for (int i = 0; i <= value; i++) {
            int numSquared = i * i;
            int numCubed = i * i * i;

            System.out.printf(" %d  | %d  | %d    \n", i, numSquared, numCubed);
        }
    }

    private static void print() {
        int i = 5;
        while (i <= 15) {
            System.out.println(i + "");
            i++;
        }
        i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 100);
    }

    private static void test() {
        int i = 5;
        while (i <= 15) {
            System.out.println(i + "");
            i++;
        }
    }

    private static void fizzbuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("Fizzbuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }
}
