package collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {
    public static void main(String[] args) {
        int[] intArray = getIntArray();

        intArray = Arrays
                .stream(intArray)
                .map(i -> {return i * 2;})
                .toArray();

        System.out.println(Arrays.toString(intArray));
    }

    public static int[] getIntArray() {
        return new int[]{1, 2, 3};
    }

    public static int[] getIntArray(int length) {
        int[] intArray = new int[length];

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = i * 2;
        }
        return intArray;
    }

    public static String[] getNameArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names do you want to enter");

        int namesLength = scanner.nextInt();
        String[] namesArr = new String[namesLength];

        for (int i = 0; i < namesLength ; i++) {
            namesArr[i] = scanner.next();
        }
        return namesArr;
    }
}
