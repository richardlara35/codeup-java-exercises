package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Students Richard = new Students("Richard");
        Richard.addGrade(80);
        Richard.addGrade(70);
        Richard.addGrade(82);

        Students Harrison = new Students("Harrison");
        Harrison.addGrade(90);
        Harrison.addGrade(50);
        Harrison.addGrade(95);

        Students Ivan = new Students("Ivan");
        Ivan.addGrade(85);
        Ivan.addGrade(70);
        Ivan.addGrade(100);

        HashMap<String, Students> students = new HashMap<>();
        students.put("richardlara", Richard);
        students.put("harrisongranados", Harrison);
        students.put("ivanzurita", Ivan);

        showOptions(students);
    }
    private static void showOptions(HashMap<String, Students> students){
        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.println("---");
        System.out.println(" Here are the Github usernames of our students: ");
        printName(students);
        System.out.println("---");
        showResults(scanner, students);
    }
    private static void showResults(Scanner scanner, HashMap<String, Students> students){
        int userChoice = showOptions(scanner);
        switch (userChoice){
            case 0:
                System.out.println("Goodbye, Have a wonderful day!");
                return;
            case 1:
                showStudentsInfo(students);
                break;
            case 2:
                System.out.println("What student would you like to see more info on?");
                System.out.println(">");
                String name = scanner.nextLine();
                showStudentInfo(name, students);
                break;
            case 3:
                System.out.println("Overall class avg is" + showClassAvg(students));
                break;
            case 4:
                PrintCsv(students);
                break;
            default:
                System.out.println("Invalid choice");
        }
        showResults(scanner, students);
    }
    private static void PrintCsv(HashMap<String, Students> students){
        Students student;
        System.out.println("\n CSV Report");
        System.out.println("name, github_user, avg");
        for (Map.Entry<String, Students> studentEntry : students.entrySet()){
            student = (Students) studentEntry.getValue();
            System.out.println((student.getName() + "," + studentEntry.getKey()+ ","+ student.getGrade()));
        }
        System.out.println("------");
    }

    private static double showClassAvg(HashMap<String, Students> students){
        double totalAvg = 0;
        Students student;
        for(Map.Entry<String, Students> studentEntry : students.entrySet()){
            student = (Students) studentEntry.getValue();
            totalAvg = totalAvg + student.getGrade();
        }
        return totalAvg/ students.size();
    }
    public static int showOptions(Scanner scanner){
        System.out.println("What would you like to do? \n" +
                "0 - exit\n"+
                "1 - view all users\n"+
                "2 - view more info for a student\n"+
                "3 - view class average\n"+
                "4 - print csv report\n"+
                "Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void showStudentsInfo(HashMap<String, Students> students){
        Students student;
        for (Map.Entry<String, Students> studentsEntry : students.entrySet()){
            student = (Students) studentsEntry.getValue();
            student.Print();
        }
    }
    private static void showStudentInfo(String name, HashMap<String, Students> students){
        if (students.containsKey(name)){
            Students student = students.get(name);
            student.Print();
        }else{
            System.out.println("Sorry, no student found with the Github name of " + name + ".");
        }
    }




    private static void printName(HashMap<String, Students> students){
        System.out.println(" | ");
        for (Map.Entry<String, Students> student : students.entrySet())
        System.out.println(student.getKey() + " | ");
        System.out.println("\n");
    }
}
