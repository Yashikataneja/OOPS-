class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0;

    CarRental() {
        customerName = "Unknown";
        carModel = "Basic Car";
        rentalDays = 1;
    }

    CarRental(String c, String model, int days) {
        customerName = c;
        carModel = model;
        rentalDays = days;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Meera", "SUV", 5);

        r1.display();
        r2.display();
    }
}

