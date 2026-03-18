public class Book {
    String title;
    String author;
    int price;

    public Book() {
        this.title = "The Blue Umbrella";
        this.author = "Ruskin Bond";
        this.price = 675;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 765;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.print();

        Book book2 = new Book("Train to Pakistan", "Khuswant Singh");
        book2.print();

        Book book3 = new Book("Wise and Otherwise", "Sudha Murty", 576);
        book3.print();
    }
}