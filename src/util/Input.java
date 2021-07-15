package util;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

    }
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
        System.out.printf("Enter a number b/w %d amd %d%n", min, max);
        try {
            int input = Integer.parseInt(getString());
            if (input > min && input < max) {
                return input;
            } else {
                System.out.println("Not in range");
                return getInt(min, max);
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            return getInt(min, max);
        }
    }

    public String getString() {
        System.out.println("Enter a string");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Y/N? ");
        String userChoice = scanner.next().toLowerCase();
        return userChoice.equals("y");
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
