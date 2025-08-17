class Circle {
    double radius;

    // Default
    Circle() {
        this(1.0);
    }
    // parameterized
    Circle(double r) {
        radius = r;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(); // default
        Circle c2 = new Circle(5.0); // parameterized

        System.out.println("Default Circle Area: " + c1.getArea());
        System.out.println("Circle with radius 5 Area: " + c2.getArea());
    }
}
