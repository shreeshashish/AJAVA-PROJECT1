import java.sql.*;

public class bank {

    public void addBank(bank bank) {

        try {

            Connection con = db_connect.getConnection();

            String sql ="INSERT INTO BANKS(bid,bname,branch,ifsc) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, bank.getbid());
            ps.setString(2, bank.getbname());
            ps.setString(3, bank.getbranch());
            ps.setString(4, bank.getifsc());

            ps.executeUpdate();

            System.out.println("Bank Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}