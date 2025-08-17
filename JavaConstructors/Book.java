class Book {
    String title;
    String author;
    double price;
    // default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    // parameterized
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
    public static void main(String[] args) {
        Book b1 = new Book(); // default
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 299.0); // parameterized

        b1.display();
        b2.display();
    }
}
