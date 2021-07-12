package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {
    public static void main(String[] args) {
//        ArrayList<String> stringArr = new ArrayList<>();
//
//        stringArr.add("Richard");
//        System.out.println("Current ArrayList Size: " + stringArr.size());
//        System.out.println(stringArr);
//        System.out.println(System.identityHashCode(stringArr));
//        System.out.println("\n");
//
//
//
//
//        stringArr.add("Casey");
//        System.out.println("Current ArrayList Size: " + stringArr.size());
//        System.out.println(stringArr);
//        System.out.println(System.identityHashCode(stringArr));
//        System.out.println("\n");

//        stringArr.remove(1);
//        System.out.println(stringArr.hashCode());

//        ArrayList<String> stringArrCopy = stringArr;
//
//        System.out.println("Array list copy: ");
//        System.out.println(stringArrCopy);
//        System.out.println("Copied list hashcode: ");
//        System.out.println(System.identityHashCode(stringArrCopy));
//        System.out.println("\n");

//        ArrayList<Person> peopleList = newArrayList<>();

        HashMap<Integer, String> myHashMap = new HashMap<>();

        for (int i = 0; i < 11; i++) {
            myHashMap.put(i, "Yuuuur");
        }
        System.out.println(myHashMap.containsValue("Yuuuur"));
    }
}
