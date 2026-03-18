import java.sql.*;
public class order {    
    public static void addOrder(int oid,int pid, int cid,int quantity)throws Exception{
        Connection conn = db_connect.getConnection();
        String sql = "insert into product values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,oid);
        ps.setInt(2,pid);
        ps.setInt(3,cid);
        ps.setInt(4,quantity);
        ps.executeUpdate();
        System.out.println("order placed successfully");
        conn.close();
    }  
    public static void countProduct() throws Exception{
        Connection conn = db_connect.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select count (*) from product");
        if(rs.next()){
            System.out.println("total products = " + rs.getInt(1));
        } 
        conn.close();
    }
    public static void showProductsName()throws Exception{
        Connection conn = db_connect.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select pname from product");
        System.out.println("product listed");
        while(rs.next()){
            System.out.println(" - " + rs.getString("pname"));
        }
        conn.close();
    }
    public static void countCustomerOrders()throws Exception{
        Connection conn = db_connect.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select count(distinct cid) from product");
        if(rs.next()){
            System.out.println("customer who ordered="+rs.getInt(1));
        }
        conn.close();
    }
}
