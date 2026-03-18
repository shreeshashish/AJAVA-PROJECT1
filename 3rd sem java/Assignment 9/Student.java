public class Student {
    String studentId;
    String studentName;
    char grade;

    public Student() {
        this("Unknown", "Unknown", 'N'); 
    }

    public Student(String studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    void display() {
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("24CSE101", "Ram Kumar Singh", 'A');
        s2.display();
    }
}