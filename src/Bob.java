import java.util.Arrays;
import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Say something to Bob : ");
        String userInput = sc.next();

        if (userInput.contains("?")) {
            System.out.println("Sure");
        } else if (userInput.contains("!")) {
            System.out.println("Whoa, Chill out");
        }else if (userInput.equals("")){
            System.out.println("Fine, be that way");
        }else{
            System.out.println("Whatever");
        }




    }
}
