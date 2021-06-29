import java.util.Arrays;
import java.util.Scanner;

public class Strings {
//    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter your full name");
//        String userName = sc.nextLine();
//        String[] array = userName.split(" ");
//        String firstName = array[0];
//        String lastName = array[1];
//        System.out.println(Names(userName));
//        System.out.println(Names(firstName, lastName));
//
//    }
//
//    public static String Names(String userName){
//        return "Hello " + userName;
//    }
//
//    public static String Names(String firstName, String lastName){
//        return "Hello " + firstName + " " + lastName;
//    }



//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Best basketball team in Texas?");
//        String userInput = sc.next();
//        System.out.println((print(userInput)));
//        System.out.println(length(print(userInput)));
//    }
//    public static String print(String userInput){
//        return "The " + userInput + " are the best team in Texas.";
//    }
//
//    public static String length(String userInput){
//        return "There are " + userInput.length() + " characters in the string " + userInput;
//    }



//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        String[] studentsArr =
////                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
////                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
////                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
////                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
////                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
////                        "Casey", "Dorian", "Tristan", "Jordy"};
////        int randomNum = (int) (Math.random() * 28);
////        String randomName = studentsArr[randomNum];
////        /* your code goes here */
////        System.out.print("Give me a name: ");
////        String userInput = sc.next();
////
////        if (userInput.equals(randomName)) {
////            System.out.println("Woah you guessed" + randomName + "!");
////        } else {
////            System.out.println("Way off! My name is " + randomName);
////        }
//        //        warmup:
////        TODO: create a new "Strings-Lecture" java class file (or wherever
////         you like to keep notes/lecture exercises. Copy given
////         code, that is your starting point. Using Scanner prompt a
////         user (in this case it's you, you're the user) to type in
////         their first name. Save the input into a String variable. If
////         your name matches randomName, print "woah! you guessed:
////         enter-randomName-here! How did you know enter-yourName-here
////         is my name?!". if randomName does
////         not
////         match your name exactly, print "Way off my friend! My name
////         isn't randomName-here. It's yourName-here.".
//
//
//        //        TODO: create a String variable that holds this sentence: "Red
////         Orange Blue Yellow Green Purple". Prompt the user to type in
////         their favorite color, if their fave color is the same as the
////         first word in the String, then print out "my fave color:
////         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"
//
//        String sentence = "Red Orange Blue Yellow Green Purple";
//        System.out.print("What is your favorite color?");
//        String userInput = sc.next();
//        if (sentence.startsWith(userInput)) {
//            System.out.println("My fave color: " + userInput + ", is the first one");
//        } else if (sentence.endsWith(userInput)) {
//            System.out.println("My fave color: "+ userInput + ", is last");
//        }else{
//            System.out.println("Congrats you're wrong");
//        }
//    }
//    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, What's your name?");
        String userName = sc.next();
        System.out.println("How old are you");
        int userAge = sc.nextInt();
        System.out.println("Do you have any pets?");
        boolean petsOrNah = sc.nextBoolean();



    }
}
