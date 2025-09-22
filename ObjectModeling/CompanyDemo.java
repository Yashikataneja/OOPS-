import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.deptName = name;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDept() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.show();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.companyName = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDept();
        }
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company c = new Company("TechSoft");

        Department d1 = new Department("HR");
        d1.addEmployee(new Employee("Anita"));
        d1.addEmployee(new Employee("Ravi"));

        Department d2 = new Department("IT");
        d2.addEmployee(new Employee("Sunil"));

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.showCompany();
        // if company deleted, departments and employees also gone
    }
}
