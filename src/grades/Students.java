package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Students {

    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Students(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGrade() {
        double total = 0;
        for (int grade : grades) {
            total = total + grade;
        }
        return total / grades.size();
    }

    public void Print() {
        System.out.println("Student: " + getName());
        System.out.println("Grade: " + getGrade());
        System.out.println("Grades: ");
        for (int grade : grades) {
            System.out.println(" " + grade + " ");
        }
    }
}


