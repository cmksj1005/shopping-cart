import java.util.ArrayList;
import java.util.List;

public class User {

    private ShoppingCart shoppingCart;
    private String id;
    private String name;
    private String address;

    public User(){
        this.shoppingCart = new ShoppingCart();
    }

    public User(String id, String name, String address) {
        // Create new shopping cart for each user
        this.shoppingCart = new ShoppingCart();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ShoppingCart getShoppingCart() {
        return this.shoppingCart;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "shoppingCart=" + shoppingCart +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
