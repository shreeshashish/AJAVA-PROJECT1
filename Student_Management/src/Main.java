//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.Scanner;
//
//
//public class Main {
//
//    private static final String url = "jdbc:mysql://localhost:3306/project1";
//    private static final String username = "root";
//    private static final String password = "mishras";
//
//    public static void main(String[] args) {
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(url, username, password);
//
//            System.out.println("Database connected sucessfully.");
//
//            Student Students=new Student();
//            Scanner sc=new Scanner(System.in);
//
//            while(true){
//                System.out.println("Menu:");
//                System.out.println("1.Show all students:");
//                System.out.println("2.Add student:");
//                System.out.println("3.Update contact:");
//                System.out.println("4.Delete student:");
//                System.out.println("Exit:");
//
//                System.out.println("Enter your choice:");
//                int ch=sc.nextInt();
//
//                switch(ch){
//                    case 1:
//                        Student.showAll(connection);
//                        break;
//                      case 2:
//                        Student.add(connection,sc);
//                        break;
//                    case 3:
//                        Student.update(connection,sc);
//                        break;
//                    case 4:
//                        Student.delete(connection,sc);
//                        break;
//                    case 5:
//                    {
//                        connection.close();
//                        return;
//                    }
//                    default:
//                        System.out.println("Invalid Choice.");
//                }
//
//            }
//
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//    }
//}

// Main.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main {

    private static final String URL =
            "jdbc:mysql://localhost:3306/project1?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "mishras";

    public static void main(String[] args) {
        try {
            // Requires mysql-connector-j on classpath
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected");

            Student student = new Student();
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
                sc.nextLine(); // consume leftover newline

                switch (ch) {
                    case 1 -> student.showAll(conn);
                    case 2 -> student.add(conn, sc);
                    case 3 -> student.update(conn, sc);
                    case 4 -> student.delete(conn, sc);
                    case 5 -> {
                        conn.close();
                        System.out.println("Bye");
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
