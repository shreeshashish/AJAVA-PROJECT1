public class Employee {
    String name;
    int salary;
    int hiredate;

    Employee(String name, int sal, int hiredate) {
        this.name = name;
        this.salary = sal;
        this.hiredate = hiredate;
    }

    void calculate(int current_year) {
        int yos = current_year - hiredate;
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Years of service: " + yos);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Pradeep", 160000, 1990);
        e.calculate(2025);
    }
}