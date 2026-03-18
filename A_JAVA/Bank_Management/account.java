import java.sql.*;

public class account {

    public void createAccount(String accno, double balance,
                              int uid, int bid) {

        try {

            Connection con = db_connect.getConnection();

            String sql ="INSERT INTO ACCOUNT(accno,balance,uid,bid) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, accno);
            ps.setDouble(2, balance);
            ps.setInt(3, uid);
            ps.setInt(4, bid);

            ps.executeUpdate();

            System.out.println("Account Created!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deposit(String accno, double balance) {

        try {

            Connection con = db_connect.getConnection();

            String sql =
              "UPDATE account SET balance = balance + ? WHERE accno=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, balance);
            ps.setString(2, accno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Amount Deposited!");
            else
                System.out.println("Account Not Found!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void withdraw(String accno, double balance) {

        try {

            Connection con = db_connection.getConnection();

            String sql =
              "UPDATE account SET balance = balance - ? WHERE accno=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, balance);
            ps.setString(2, accno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Amount Withdrawn!");
            else
                System.out.println("Account Not Found!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AccountDetails getAccountDetails(String accno) {

        AccountDetails details = null;

        try {

            Connection con = db_connect.getConnection();

            String sql = """
            SELECT a.ACC_NO, a.BALANCE,
                   u.UNAME, u.AADHAR, u.PAN,
                   b.BNAME, b.BRANCH, b.IFSC
            FROM ACCOUNT a
            JOIN USER u ON a.U_ID = u.U_ID
            JOIN BANKS b ON a.B_ID = b.B_ID
            WHERE a.ACC_NO = ?
            """;

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, accNo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                details = new AccountDetails();

                details.setAccNo(rs.getString("accno"));
                details.setBalance(rs.getDouble("balance"));

                details.setUserName(rs.getString("uname"));
                details.setAadhar(rs.getString("aadhar"));
                details.setPan(rs.getString("pan"));

                details.setBankName(rs.getString("bname"));
                details.setBranch(rs.getString("branch"));
                details.setIfsc(rs.getString("ifsc"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return details;
    }
}