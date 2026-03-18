import java.util.Scanner;
public class Student {
    String name;
    int roll;
    String course;

    void option(int choice) {
        switch(choice) {
            case 1:
                course = "OOP";
                break;
            case 2:
                course = "DBMS";
                break;
            case 3:
                course = "DSA";
                break;
            case 4:
                course = "OS";
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll);
        System.out.println("Course: " + course);
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student("Shyam", 24000);
        System.out.println("Choose a course: ");
        System.out.println("1. OOP\n2. DBMS\n3. DSA\n4. OS");
        int choice = sc.nextInt();
        s.option(choice);
        s.display();
        sc.close();
    }
}
