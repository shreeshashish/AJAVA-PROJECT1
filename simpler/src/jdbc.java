import java.sql.*;
import java.util.Scanner;
public class jdbc {

    private static final String url = "jdbc:mysql://localhost:3306/Forjdbc";
    private static final String username = "root";
    private static final String password = "mishras";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            //Create Statement
            //Statement statement = connection.createStatement();
//            PreparedStatement ps=Connection.PreparedStatement(Query);
            Scanner sc=new Scanner(System.in);
            //INSERT
            String insertQuery ="INSERT INTO Learner (ID,name,age,salary)" + "VALUES (?,?,?,?)";
            PreparedStatement insertStmt = connection.prepareStatement(insertQuery);


            // -------------------//
            //"INSERT INTO Learner (ID, name, age, salary) " + "VALUES (4, 'Virat', 25, 45000)";
            //int insertCount = statement.executeUpdate(Query);
            //System.out.println(insertCount + " record inserted");
            //-------------------//

            System.out.print("Enter ID:");
            int ID=sc.nextInt();
            System.out.print("Enter name:");
            String name=sc.next();
            System.out.print("Enter age:");
            int age=sc.nextInt();
            System.out.print("Enter salary:");
            double salary=sc.nextDouble();

            insertStmt.setInt(1,ID);
            insertStmt.setString(2,name);
            insertStmt.setInt(3,age);
            insertStmt.setDouble(4,salary);

            int insertCount=insertStmt.executeUpdate();
            System.out.println(insertCount+"Record Inserted");



            //UPDATE
            String updateQuery ="UPDATE Learner SET salary = ? WHERE ID = ?";
            PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
            System.out.println("Enter new Salary:");
            double newsalary=sc.nextDouble();
            System.out.println("Enter id to update:");
            int IDToupdate=sc.nextInt();
            updateStmt.setDouble(1,newsalary);
            updateStmt.setInt(2,IDToupdate);
            int updateCount = updateStmt.executeUpdate();
            System.out.println(updateCount + " record updated");



            //DELETE
            String deleteQuery ="DELETE FROM Learner WHERE ID = ?";
            PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery);
            System.out.print("Enter id to delete:");
            int IDToDelete=sc.nextInt();
            deleteStmt.setInt(1,IDToDelete);

            int deleteCount =deleteStmt.executeUpdate();

            //------------------------//
//            System.out.println(deleteCount + " record deleted");
            //-----------------------//
//            //SELECT

            String selectQuery = "SELECT * FROM Learner";
            PreparedStatement selectStmt = connection.prepareStatement(selectQuery);
            ResultSet resultSet=selectStmt.executeQuery();
            System.out.println("\nID  Name  Age  Salary");
            while (resultSet.next()) {
                System.out.println(
                resultSet.getInt("ID")+" "
                        + resultSet.getString("name")+" "
                        +resultSet.getInt("age")+ " "
                        +resultSet.getDouble("salary")  );
            }

            //------------------//
//            resultSet.close();
//            statement.close();
//            connection.close();
            //------------------//
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
