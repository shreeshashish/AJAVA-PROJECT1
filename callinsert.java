import java.sql.*;
public class callinsert {
    private static final String URL ="jdbc:mysql://localhost:3306/project1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mishras";
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            CallableStatement csinsert = connection.prepareCall("{call addstudent(?,?,?,?)}");
            csinsert.setInt(1, 3);
            csinsert.setString(2, "Pradeep");
            csinsert.setString(3, "9348119513");
            csinsert.setString(4, "Accountancy");
            csinsert.execute();
            System.out.println("Student inserted!");
            

            CallableStatement csall = connection.prepareCall("{call getstudentid()}");
        ResultSet rsall = csall.executeQuery();
        while(rsall.next()){
            System.out.println(
            rsall.getInt("id")+ " "+
            rsall.getString("name")+ " "+
            rsall.getString("phone")+ " "+
            rsall.getString("department")
            );
        }
        csinsert.close();
        connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
}