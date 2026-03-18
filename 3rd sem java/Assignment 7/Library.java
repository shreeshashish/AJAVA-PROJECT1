public class Library {
    int[] bookid = new int[10];
    String[] bookname = new String[10];
    String[] author = new String[10];
    int i = 0;

    void add(int id, String name, String auth) {
        bookid[i] = id;
        bookname[i] = name;
        author[i] = auth;
        i++;
    }

    void remove(int id) {
        for(int j=0; j < bookid.length; j++) {
            if(bookid[j]==id) {
                for(int k = j; k < i; k++) {
                    bookid[k] = bookid[k+1];
                    bookname[k] = bookname[k+1];
                    author[k] = author[k+1];
                }
                i--;
            }
        }
    }

    void display() {
        System.out.println("Books in the library are: ");
        for(int j = 0; j < i; j++) {
            System.out.println();
            System.out.println("Book id: " + bookid[j]);
            System.out.println("Book name: " + bookname[j]);
            System.out.println("Author: " + author[j]);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.add(101, "Let us C", "Yashvant Kanetkar");
        lib.add(103, "Norwegian Wood", "Murakami");
        lib.add(102, "The Metamorphosis", "Franz Kafka");
        lib.remove(101);
        lib.display();
    }
}
