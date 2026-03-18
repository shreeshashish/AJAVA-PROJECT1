import java.sql.*;
public class Result {
    public static void saveResult(int roll, int marks) {
        try {
            Connection con = db_connect.getConnection();
            String status = (marks >= 3) ? "PASS" : "FAIL";
            String sql ="INSERT INTO result VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll);
            ps.setInt(2, marks);
            ps.setString(3, status);

            ps.executeUpdate();

            System.out.println("\nRESULT");
            System.out.println("Marks = " + marks);
            System.out.println("Status = " + status);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}