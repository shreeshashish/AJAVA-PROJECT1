import java.sql.*;

public class Student {

    public static boolean login(int roll, String pass) {

        try {
            Connection con = db_connect.getConnection();

            String sql ="SELECT * FROM student WHERE rollno=? AND password=?";

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

    public static void register(int roll, String pass) {

        try {
            Connection con = db_connect.getConnection();

            String sql =
                "INSERT INTO student VALUES (?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, roll);
            ps.setString(2, pass);

            ps.executeUpdate();

            System.out.println("Student Registered!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}