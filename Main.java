public class Main {
    public static void main(String[] args) {

        Login login = new Login();

        if (login.authenticate()) {
            System.out.println("\nLogin Successful ");
            Quiz quiz = new Quiz();
            quiz.startQuiz();
        } else {
            System.out.println("\nInvalid Login ");
        }
    }
}
