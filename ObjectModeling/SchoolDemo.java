import java.util.ArrayList;

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println("Student: " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(c.name);
        }
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School s = new School("ABC School");

        Student st1 = new Student("Rahul");
        Student st2 = new Student("Priya");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s.addStudent(st1);
        s.addStudent(st2);

        st1.enroll(c1);
        st2.enroll(c1);
        st2.enroll(c2);

        st1.showCourses();
        st2.showCourses();
        c1.showStudents();
        c2.showStudents();
    }
}
