import java.sql.*;

public class customer {
    public static void addCustomer(int cid,String name,String email)throws Exception {
        Connection conn = db_connect.getConnection();
        String sql = "insert into customer values(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,cid);
        ps.setString(2,name);
        ps.setString(3,email);
        ps.executeUpdate();
        System.out.println("Customer inserted successfully");
        conn.close();
    }       
}
