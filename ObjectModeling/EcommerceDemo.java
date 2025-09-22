import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products) {
            System.out.println(p.name + " - Rs." + p.price);
        }
    }
}

class Customer2 {
    String name;

    Customer2(String name) {
        this.name = name;
    }

    Order placeOrder() {
        System.out.println(name + " placed an order.");
        return new Order();
    }
}

public class EcommerceDemo {
    public static void main(String[] args) {
        Customer2 c2 = new Customer2("Rohit");
        Order o1 = c2.placeOrder();

        Product p1 = new Product("Shoes", 1200);
        Product p2 = new Product("Watch", 2500);

        o1.addProduct(p1);
        o1.addProduct(p2);

        o1.showOrder();
    }
}
