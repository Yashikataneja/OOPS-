import java.util.ArrayList;

class CourseUMS {
    String name;
    Professor professor;
    ArrayList<StudentUMS> students = new ArrayList<>();

    CourseUMS(String name) {
        this.name = name;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + name);
    }

    void addStudent(StudentUMS s) {
        students.add(s);
    }
}

class StudentUMS {
    String name;

    StudentUMS(String name) {
        this.name = name;
    }

    void enrollCourse(CourseUMS c) {
        c.addStudent(this);
        System.out.println(name + " enrolled in " + c.name);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

public class UniversityManagementSystem{
    public static void main(String[] args) {
        CourseUMS c1 = new CourseUMS("Data Structures");
        StudentUMS s1 = new StudentUMS("Karan");
        StudentUMS s2 = new StudentUMS("Anjali");
        Professor p1 = new Professor("Dr. Singh");

        c1.assignProfessor(p1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
    }
}

