package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Warmup0714 {
    public static void main(String[] args) {

//        ArrayList<Integer> myArrList = new ArrayList<Integer>();
//        myArrList.get(2);
//        System.out.println(Arrays.toString(toArray()));
    }
    public static String[] toArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a string");
        String userInput = sc.nextLine();
        return userInput.split("\\s", -1);
        }


    }

