import java.sql.*;
public class product {
    public static void addProduct(int pid, String pname, int price)throws Exception{
        Connection conn = db_connect.getConnection();
        String sql = "insert into product values(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,pid);
        ps.setString(2,pname);
        ps.setInt(3,price);
        ps.executeUpdate();
        System.out.println("product inserted successfully");
        conn.close();
    }

}
