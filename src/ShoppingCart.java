import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    private final List<Product> products;
    Scanner scanner = new Scanner(System.in);

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void setProducts(Product product) {
        this.products.add(product);
    }

    public void removeProducts(String productName){
        // find a product in the shopping cart using product name
        for(Product product : this.products){
            if(product.getName().equals(productName)){
                // ask question about removing products from the shopping cart
                System.out.println("*** Remove this product from your Shopping Cart ***");
                System.out.println("Name: " + product.getName());
                System.out.println("Price: $" + product.getPrice());
                System.out.println("Quantity: " + product.getQuantity());
                System.out.println("----------------------------");
                System.out.println("How many do you plan to remove?:");
                int removeNum = Integer.parseInt(scanner.nextLine());

                if(removeNum >= product.getQuantity()){
                    // if the removing quantity is bigger than (or the same as) the product quantity
                    // remove all the product
                    this.products.remove(product);
                    // when user remove all the products from the shoppingcart,
                    // it makes an error, because for loop is keep looping.
                    // so I added break keyword.
                    if (this.products.isEmpty()){
                        break;
                    }
                }else{
                    // if the removing quantity is less than the product quantity
                    // reduce the quantity
                    int newQuantity = product.getQuantity() - removeNum;
                    product.setQuantity(newQuantity);
                }
            }
        }
    }

    public void calculateTotalCost(){
        // multiply quantity and price for each product in the shopping cart
        // then add the multiplied cost to total cost
        double totalCost = 0.00;
        System.out.println("********** Calculate Total Cost **********");
        System.out.println("Product Id | Name | Price | Quantity | Description");
        for(Product product : this.products){
            System.out.println(product.getProductId() + "  | " + product.getName() + " | " + product.getPrice() + " | " + product.getQuantity() + " | " + product.getDescription());
            totalCost += (product.getPrice() * product.getQuantity());
        }
        System.out.println("----------------------------");
        System.out.println("Total Cost: $" + totalCost);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
