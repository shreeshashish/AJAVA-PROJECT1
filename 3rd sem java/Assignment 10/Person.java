public class Person {
    String fname;
    String lname;

    Person (String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    String getFirstName() {
        return fname;
    }
    
    String getLastName() {
        return lname;
    }
}

class Employee extends Person {
    String emp_id;
    String job_title;

    Employee (String fname, String lname, String emp_id, String job_title) {
        super(fname, lname);
        this.emp_id = emp_id;
        this.job_title = job_title;
    }

    String getEmployeeId() {
        return emp_id;
    }
    
    String getLastName() {
        return job_title;
    }

    void display() {
        System.out.println("First name: " + getFirstName() + "\nLast name: " + super.getLastName() + "\nEmployee Id: " + getEmployeeId() + "\nJob Title: " + getLastName());
    }

    public static void main(String[] args) {
        Employee e = new Employee("Byomkesh", "Bakshi", "5821", "Criminologist");
        e.display();
    }
}