import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//        /* your code goes here */
//        System.out.print("Give me a name: ");
//        String userInput = sc.next();
//
//        if (userInput.equals(randomName)) {
//            System.out.println("Woah you guessed" + randomName + "!");
//        } else {
//            System.out.println("Way off! My name is " + randomName);
//        }
        //        warmup:
//        TODO: create a new "Strings-Lecture" java class file (or wherever
//         you like to keep notes/lecture exercises. Copy given
//         code, that is your starting point. Using Scanner prompt a
//         user (in this case it's you, you're the user) to type in
//         their first name. Save the input into a String variable. If
//         your name matches randomName, print "woah! you guessed:
//         enter-randomName-here! How did you know enter-yourName-here
//         is my name?!". if randomName does
//         not
//         match your name exactly, print "Way off my friend! My name
//         isn't randomName-here. It's yourName-here.".


        //        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"

        String sentence = "Red Orange Blue Yellow Green Purple";
        System.out.print("What is your favorite color?");
        String userInput = sc.next();
        if (sentence.startsWith(userInput)) {
            System.out.println("My fave color: " + userInput + ", is the first one");
        } else if (sentence.endsWith(userInput)) {
            System.out.println("My fave color: "+ userInput + ", is last");
        }else{
            System.out.println("Congrats you're wrong");
        }
    }
}
