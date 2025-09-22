import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Faculty: " + name);
    }
}

class DepartmentU {
    String deptName;

    DepartmentU(String name) {
        this.deptName = name;
    }

    void showDept() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String uniName;
    ArrayList<DepartmentU> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.uniName = name;
    }

    void addDepartment(DepartmentU d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showUniversity() {
        System.out.println("University: " + uniName);
        for (DepartmentU d : departments) d.showDept();
        for (Faculty f : faculties) f.show();
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University u = new University("Delhi University");

        u.addDepartment(new DepartmentU("Computer Science"));
        u.addDepartment(new DepartmentU("Physics"));

        Faculty f1 = new Faculty("Dr. Sharma");
        u.addFaculty(f1);
        Faculty f2 = new Faculty("Dr. Mehta");
        u.addFaculty(f2);

        u.showUniversity();
    }
}
