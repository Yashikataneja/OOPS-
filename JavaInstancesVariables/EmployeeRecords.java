class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }
    public void setSalary(double sal) {
        salary = sal;
    }

    public double getSalary() {
        return salary;
    }
}
class Manager extends Employee {
    String teamName;

    Manager(int id, String dept, double sal, String team) {
        super(id, dept, sal);
        teamName = team;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary() + ", Team: " + teamName);
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 75000, "Backend Team");
        m.displayDetails();
        m.setSalary(80000);
        m.displayDetails();
    }
}
