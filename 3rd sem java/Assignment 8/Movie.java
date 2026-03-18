import java.util.Scanner;
public class Movie {
    String title;
    String director;
    String[] actors;
    String[] reviews;

    Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    void add() {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No. of actors: ");
        n = sc.nextInt();
        sc.nextLine();
        actors = new String[n];
        System.out.println("Enter actor names:");
        for(int i=0; i<n; i++) {
            actors[i] = sc.nextLine();
        }

        System.out.print("Enter No. of reviews: ");
        n = sc.nextInt();
        sc.nextLine();
        reviews = new String[n];
        System.out.println("Write reviews:");
        for(int i=0; i<n; i++) {
            reviews[i] = sc.nextLine();
        }

        sc.close();
    }

    void retrieve() {
        System.out.println();
        System.out.println("Movie: " + title);
        System.out.println("Directed by: " + director);
        System.out.println("Actors:");
        for(int i=0; i < actors.length; i++) {
            System.out.println(actors[i]);
        }
        System.out.println("Reviews:");
        for(int i=0; i < reviews.length; i++) {
            System.out.println(reviews[i]);
        }
    }

    public static void main(String[] args) {
        Movie m = new Movie("Mahavatar Narsimha", "Ashwin Kumar");
        m.add();
        m.retrieve();
    }
}