package util;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    private int num;
    private double numDbl;

    public Input() {
        this.scanner = new Scanner(System.in);
        this.num = num;
        this.numDbl = numDbl;
    }

    public int getInt() {
        System.out.println("Enter an Integer");
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max) {
        int number;
        do {
            System.out.printf("Enter a number b/w %d amd %d%n", min, max);
            number = scanner.nextInt();
        } while (number < min || number > max);
        return number;
    }

    public String getString() {
        String hello = "Hello";
        return hello;
    }

    public boolean yesNo() {
        System.out.println("Y/N? ");
        String userChoice = scanner.next().toLowerCase();
        if (userChoice.equals("y")) {
            return true;
        }
        return false;
    }
    public double getDouble(double min, double max){
        this.numDbl = getDouble();
        if (numDbl < min){
            System.out.println("Pick a number b/w " + min + " and " + max);
            getDouble(min, max);
        }else if (numDbl > max){
            System.out.println("Pick a number b/w " + min + " and " + max);
            getDouble(min, max);
        }
        return this.numDbl;
    }

    public double getDouble(){
        System.out.println("Pick a number: ");
        return scanner.nextDouble();
    }
}
