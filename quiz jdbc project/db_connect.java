import java.sql.Connection;
import java.sql.DriverManager;

public class db_connect {

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/quiz",
                "root",
                "mishras"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}