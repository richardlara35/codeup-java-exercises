import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjArray = {"Nice","Mean", "Fast", "Punk", "Red", "Quiet",
                "Strong", "Softy", "Tired", "Energetic"};
        String[] nounArray = {"Dogs", "Cats", "Lion", "Car", "Phone",
        "Cup", "Computer", "Bus", "Bird", "Raccoon" };

        System.out.println(generator(adjArray, nounArray));

    }
    public static String generator(String[] adjArray, String[] nounArray){

        int randomAdj = new Random().nextInt(adjArray.length);
        int randomNoun = new Random().nextInt(nounArray.length);
        return "Your server name is " + adjArray[randomAdj] +" "+ nounArray[randomNoun];

    }

}
