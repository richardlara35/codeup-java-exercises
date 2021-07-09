package warmup;

import java.util.Arrays;
import java.util.Scanner;

// TODO: Create a method which will return a String[] containing the user's favorite vacation spots
//  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
//  -> Then, add the old elements
//  -> Finally, add the new element
//  -> When the user decides to finish inputting spots, return the String[].
//  -> sout out the returned value!
public class Warmup0711 {
    public static void main(String[] args) {

        String[] Places = {};

        System.out.println("Good Vacation Spots?");


        System.out.println(Arrays.toString(addElement(Places, userInput())));

    }

    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String[] addElement(String[] Places, String userInput) {
        Places = Arrays.copyOf(Places, Places.length + 1);
        Places[Places.length - 1] = userInput;
        if (!userInput.equalsIgnoreCase("q")) {
            return addElement(Places, userInput);
        }

        return Places;
    }
}
