import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args) {
        int num = getInteger(10,100);

        System.out.println(addition(20,20));
        System.out.println(subtraction(20,40));
        System.out.println(multiplication(5,10));
        System.out.println(division(5,10));
        System.out.println(modulus(5,10));
        multiplicationTable(20);
        System.out.printf("Factorial %d is %d.", num, getFactorial(num));
    }

    public static long getFactorial(int num){
        if (num >= 1)
            return num * getFactorial(num - 1);
        else
            return 1;
    }

    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return b - a;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        return a / b;
    }

    public static int modulus(int a, int b){
        return a % b;
    }

    public static void multiplicationTable(int a){
        int total = 0;
        for (int i = 1; i <= 10 ; i++) {
            total = total + a;
            System.out.println(total);
        }
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        String userString;
        int userInt;
        do{
            System.out.printf("Enter an int b/w %d-%d", min, max);
            userInt = sc.nextInt();
            if(userInt >= min && userInt <= max) {
                break;
            }else{
                System.out.println("Int not in range");
            }
            System.out.println("Do you want to continue? Y/N?");
            userString = sc.next();
        }while(!userString.equalsIgnoreCase("n"));
        return userInt;
    }

}
