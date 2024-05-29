import java.util.Scanner;

public class Product {

    private int productId;
    private String name;
    private String description;
    private double price;
    private int quantity;

    private static int increasedId;

    Scanner scanner = new Scanner(System.in);

    public Product() {
        this.productId = 0;
        this.name = "";
        this.description = "";
        this.price = 0.00;
        this.quantity = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductInfo(){
        // Ask product info to the user and save the info to the variables
        increasedId++;
        this.productId = increasedId;
        System.out.println("----------------------------");
        System.out.println("Enter the product name:");
        this.name = scanner.nextLine();
        System.out.println("Enter the description:");
        this.description = scanner.nextLine();
        System.out.println("Enter the price:");
        this.price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the Quantity:");
        this.quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("----------------------------");

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
