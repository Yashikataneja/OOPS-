// Interface Worker
interface Worker {
    void performDuties();
}

// Superclass Person
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Subclass Chef that extends Person and implements Worker
class Chef extends Person implements Worker {
    String speciality;

    Chef(String name, int id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking delicious " + speciality + ".");
    }
}

// Subclass Waiter that extends Person and implements Worker
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving at " + tablesAssigned + " tables.");
    }
}

// Main class
public class Restaurant {
    public static void main(String[] args) {
        Chef chef = new Chef("Rajesh", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Aman", 202, 5);

        System.out.println("--- Restaurant Staff Details ---");
        chef.displayPersonInfo();
        chef.performDuties();

        waiter.displayPersonInfo();
        waiter.performDuties();
    }
}
