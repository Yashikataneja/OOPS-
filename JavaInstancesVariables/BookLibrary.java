class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String i, String t, String a) {
        ISBN = i;
        title = t;
        author = a;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }
}
class EBook extends Book {
    double fileSize;

    EBook(String i, String t, String a, double size) {
        super(i, t, a);
        fileSize = size;
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() + ", File Size: " + fileSize + "MB");
    }

    public static void main(String[] args) {
        EBook eb = new EBook("123-456", "Java Basics", "James Gosling", 2.5);
        eb.displayDetails();
    }
}
