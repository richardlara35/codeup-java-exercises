package Company;

// extends keyword creates subclass of the Employee abstract class
public class Manager extends Employee{
    //every child must define the method

    public static void main(String[] args) {
        Manager Suzy = new Manager();
        Suzy.nameOfEmployee = "Suzy";
        Suzy.department = "Marketing";
        System.out.println(Suzy.doWork(250));
    }
}
