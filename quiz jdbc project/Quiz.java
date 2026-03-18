import java.sql.*;
import java.util.Scanner;


public class Quiz {

    public static int startQuiz() {

        int score = 0;

        try {

            Connection con = db_connect.getConnection();

            Statement st = con.createStatement();
            ResultSet rs =
                st.executeQuery("SELECT * FROM question");

            Scanner sc = new Scanner(System.in);

            while (rs.next()) {

                System.out.println("\n" + rs.getString("question"));

                System.out.println("1. " + rs.getString("opt1"));
                System.out.println("2. " + rs.getString("opt2"));
                System.out.println("3. " + rs.getString("opt3"));
                System.out.println("4. " + rs.getString("opt4"));

                System.out.print("Your answer: ");
                int ans = sc.nextInt();

                if (ans == rs.getInt("correct_option")) {
                    score++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return score;
    }
}