// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.util.Scanner;

// public class Admin {

//     private static final String ADMIN_PASS = "admin123";

//     public static boolean login(String pass) {
//         return ADMIN_PASS.equals(pass);
//     }

    
//     public static void insertQuestion() {

//         Scanner sc = new Scanner(System.in);

//         try {

//             Connection con = db_connect.getConnection();


//             System.out.print("Question: ");
//             sc.nextLine(); 
//             String question = sc.nextLine();

//             System.out.print("Option 1: ");
//             String o1 = sc.nextLine();

//             System.out.print("Option 2: ");
//             String o2 = sc.nextLine();

//             System.out.print("Option 3: ");
//             String o3 = sc.nextLine();

//             System.out.print("Option 4: ");
//             String o4 = sc.nextLine();

//             System.out.print("Correct Option Number (1-4): ");
//             int correct = sc.nextInt();

//             String sql ="INSERT INTO question(question,opt1,opt2,opt3,opt4,correct_option) "+ "VALUES(?,?,?,?,?,?)";

//             PreparedStatement ps = con.prepareStatement(sql);

//             ps.setString(1, question);
//             ps.setString(2, o1);
//             ps.setString(3, o2);
//             ps.setString(4, o3);
//             ps.setString(5, o4);
//             ps.setInt(6, correct);

//             ps.executeUpdate();

//             System.out.println("Question Inserted Successfully!");

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }