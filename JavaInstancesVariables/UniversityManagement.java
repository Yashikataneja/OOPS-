class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int roll, String n, double c) {
        rollNumber = roll;
        name = n;
        CGPA = c;
    }
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double c) {
        CGPA = c;
    }
}
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int roll, String n, double c, String spec) {
        super(roll, n, c);
        specialization = spec;
    }

    void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Amit", 8.5, "Computer Science");
        pg.displayDetails();
    }
}

