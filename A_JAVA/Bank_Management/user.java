import java.sql.*;

public class user {

    public void addUser(user user) {

        try {

            Connection con = db_connect.getConnection();

            String sql ="INSERT INTO USER(uid,uname,dob,aadhar,pan) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, user.getuid());
            ps.setString(2, user.getuname());
            ps.setDate(3, user.getdob());
            ps.setString(4, user.getaadhar());
            ps.setString(5, user.getpan());

            ps.executeUpdate();

            System.out.println("User Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}