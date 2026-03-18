import java.sql.*;
import java.util.Scanner;

public class Login {
    public boolean authenticate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter Password: ");
        String pass = sc.next();

        try {
            Connection con = DBConnect.getConnection();
            if (con == null) return false;

            String sql = "SELECT * FROM student WHERE rollno=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, roll);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
