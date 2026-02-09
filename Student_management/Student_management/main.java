package Student_management;

import java.sql.*;
import java.util.Scanner;

public class main {

    private static final String URL =
            "jdbc:mysql://localhost:3306/project1?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "mishras";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected");

            student student = new student();
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Show All Students");
                System.out.println("2. Add Student");
                System.out.println("3. Update Phone");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                int ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {
                    case 1 -> student.showAll(conn);
                    case 2 -> student.add(conn, sc);
                    case 3 -> student.update(conn, sc);
                    case 4 -> student.delete(conn, sc);
                    case 5 -> {
                        conn.close();
                        System.out.println("Bye 👋");
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
