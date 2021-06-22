import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
//        String name = "Richard";
//        String status = "sleepy";
//        String adj = "muy";
//        String mySentence = String.format("Good morning %s is %S %s" , name, adj, status);
//
//        System.out.println(mySentence);


//        float currencyInPennies = 1000.0f;
//
//        System.out.printf("I'll sell you my land for $%.2f per acre", currencyInPennies);

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your full name");
        String firstName = sc.next();
        String lastName = sc.next();
        System.out.printf("Your first name is: %s\n", firstName);
        System.out.printf("Your first name is: %s\n", lastName);


    }
}


