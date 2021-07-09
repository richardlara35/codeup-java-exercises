package warmup;

import java.util.Scanner;

public class Warmup0709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Drop a String");
        String userInput = sc.nextLine();

        int count = 0;

        for (int x = 0; x < userInput.length(); x++){
            if (Character.isUpperCase(userInput.charAt(x))) count++;
        }
        System.out.println("There are " + count + " capital letters in this string");
    }
}
