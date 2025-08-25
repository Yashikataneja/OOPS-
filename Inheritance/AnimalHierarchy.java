class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " (Dog) says: Woof! Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " (Cat) says: Meow! Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " (Bird) says: Tweet! Tweet!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Mithu", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        System.out.println("\n--- Polymorphism Example ---");

        Animal a1 = new Dog("Rocky", 4);
        Animal a2 = new Cat("Simba", 5);
        Animal a3 = new Bird("Chirpy", 2);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
