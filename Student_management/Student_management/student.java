package Student_management;


import java.sql.*;
import java.util.Scanner;

public class student {

    public void showAll(Connection connection) {

        String sql = "SELECT * FROM STUDENTS";

        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\nID | Name | Roll | Contact | Email | Department");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("ID") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("roll_no") + " | " +
                        rs.getLong("contact") + " | " +
                        rs.getString("email") + " | " +
                        rs.getString("department")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void add(Connection connection, Scanner sc) {

        String sql =
                "INSERT INTO STUDENTS(ID,name,roll_no,contact,email,department) VALUES (?,?,?,?,?,?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            System.out.print("Enter ID: ");
            ps.setInt(1, sc.nextInt());
            sc.nextLine();

            System.out.print("Enter Name: ");
            ps.setString(2, sc.nextLine());

            System.out.print("Enter Roll No: ");
            ps.setString(3, sc.nextLine());

            System.out.print("Enter Phone: ");
            ps.setLong(4, sc.nextLong());
            sc.nextLine();

            System.out.print("Enter Email: ");
            ps.setString(5, sc.nextLine());

            System.out.print("Enter Department: ");
            ps.setString(6, sc.nextLine());

            ps.executeUpdate();
            System.out.println("Student Added ✅");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Connection connection, Scanner sc) {

        String sql = "UPDATE STUDENTS SET contact=? WHERE ID=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter New Phone: ");
            long phone = sc.nextLong();

            ps.setLong(1, phone);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Updated ✅");
            else
                System.out.println("Student not found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Connection connection, Scanner sc) {

        String sql = "DELETE FROM STUDENTS WHERE ID=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            System.out.print("Enter ID to delete: ");
            int id = sc.nextInt();

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Deleted ✅");
            else
                System.out.println("Student not found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
