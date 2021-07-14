import java.util.Scanner;

public class ExceptionsLecture {
    public static void main(String[] args) throws Exception {
        byte age;
        int funds;

        System.out.println(newAccount());

    }

    public static String newAccount() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
//        if (sc.next != byte )

        byte userAge = sc.nextByte();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your bread looking like?");
        int funds = scanner.nextInt();
        if (userAge < 16 && funds < 200){
            throw new Exception("You're too young and broke!");
        }else if(userAge < 16){
            throw new Exception("You're too young!");
        }else if(funds < 200) {
        throw new Exception("You're too broke!");
        }else
         return "We'll take your money";
    }


}
