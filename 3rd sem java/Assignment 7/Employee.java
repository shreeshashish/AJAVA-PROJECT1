import java.util.Scanner;
public class Employee {
    String name;
    String job;
    int salary;
    int updated_sal;

    int calculate(int n) {
        int per_day = salary/30;
        int total = n*per_day;
        return total;
    }

    void update(int total) {
        updated_sal = total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, total;
        Employee emp = new Employee();
        emp.name = "Shreeshasish Mishra";
        emp.job = "Software Engineer";
        emp.salary = 100000;
        System.out.println("Enter no. of working days: ");
        n = sc.nextInt();
        total = emp.calculate(n);
        emp.update(total);
        System.out.println("Updated salary is: " + emp.updated_sal);
        sc.close();
    }
}
