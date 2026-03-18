import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1. Register Student");
            System.out.println("2. Student Login & Start Quiz");
            System.out.println("3. Admin pannel");
            System.out.println("4. Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();

                    System.out.print("Enter Password: ");
                    String pass = sc.next();

                    Student.register(roll, pass);
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    roll = sc.nextInt();

                    System.out.print("Enter Password: ");
                    pass = sc.next();

                    if (Student.login(roll, pass)) {

                        System.out.println("Login Success!");

                        int marks = Quiz.startQuiz();

                        Result.saveResult(roll, marks);

                    } else {
                        System.out.println("Invalid Login!");
                    }
                    break;

               case 3:
                System.exit(0);
            }
        }
    }
}

    // System.out.print("Enter Admin Password: ");
    // String adminPass = sc.next();

    // if (Admin.login(adminPass)) {

    //     System.out.println("\nAdmin Login Successful!");

    //     while (true) {

    //         System.out.println("1. Insert Question");
    //         System.out.println("2. Back to Main Menu");

    //         int ch2 = sc.nextInt();

    //         if (ch2 == 1) {
    //             Admin.insertQuestion();
    //         } else {
    //             break;
    //         }
    //     }

    // } else {
    //     System.out.println("Wrong Admin Password!");
    // }

    // break;
    //         }
