class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Java Basics", "James Gosling", 450.0);
        lb.display();
        lb.borrowBook();
        lb.borrowBook(); 
    }
}

