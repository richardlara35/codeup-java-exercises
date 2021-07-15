package warmup;

import java.util.Random;

public class Warmup0715 {
    //WARM UP
// TODO Given this string: `String str = "Oberon is the
//  best cohort ever!"`,  that generates
//  a number between 0 and 50 and print out the character from that
//  string using a random number generator. Using a try/catch block, handle
//  any errors (Exceptions) that may occur by printing out the
//  message.
    public static void main(String[] args) {
        String str = "Oberon is the best cohort ever!";
        generate(str);

    }

    public static char generate(String str){
        Random random = new Random();
        int randomNum = random.nextInt(50);
        try{
            return str.charAt(randomNum);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String index out of bounds, Random number " + randomNum + "\nString has index of " + str.length());
            return generate(str);
        }

    }

}
