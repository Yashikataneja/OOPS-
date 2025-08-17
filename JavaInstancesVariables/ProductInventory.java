class Product {
    String productName;
    double price;

    static int totalProducts = 0;

    // Constructor
    Product(String name, double p) {
        productName = name;
        price = p;
        totalProducts++;
    }
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }
    static void displayTotalProducts() {
        System.out.println("Total products created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 45000);
        Product p2 = new Product("Phone", 20000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
