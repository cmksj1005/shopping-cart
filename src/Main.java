/**********************************************
 Workshop 1
 Course:<APD545> - 2024 Summer Semester
 Last Name:<Shinjo>
 First Name:<Kang>
 ID:<118235227>
 Section:<NAA>
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Shinjo Kang
 Date:<2024-05-22>
 **********************************************/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int optionNum;
        boolean programOn = true;
        Scanner scanner = new Scanner(System.in);
        Users users = new Users();
        User logInUser;

        while(programOn){
            // main menu before login
            System.out.println("Welcome to Nexura Shopping!");
            System.out.println("Choose the service you need!");
            System.out.println("----------------------------");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In (Enter 'guest', if you want to join as a guest)");
            System.out.println("3. Exit");
            System.out.println("----------------------------");
            System.out.println("Enter the option number:");

            optionNum = Integer.parseInt(scanner.nextLine());

            if (optionNum == 1){
                // Sign Up process
                RegisteredUser registeredUser = new RegisteredUser();
                registeredUser.setRegisteredUserInfo();
                users.setUsers(registeredUser);

            } else if (optionNum == 2) {
                // Sign In process
                String userId;
                System.out.println("Enter your ID:");
                userId = scanner.nextLine();
                // Log in as a guest, if user enter 'guest'
                if(userId.equals("guest")) {
                    logInUser = new GuestUser();
                }else{
                    logInUser = users.searchUserInfo(userId);
                }

                boolean loginOn = true;

                while(loginOn){
                    // main menu after login
                    System.out.println("");
                    System.out.println("----------------------------");
                    System.out.println("Hi, " + logInUser.getId() + "!");
                    System.out.println("What can I get for you?");
                    System.out.println("----------------------------");
                    System.out.println("1. Add product");
                    System.out.println("2. Remove product");
                    System.out.println("3. Calculate total cost");
                    System.out.println("4. Return to main menu (Sign out)");
                    System.out.println("----------------------------");
                    System.out.println("Enter the option number:");

                    optionNum = Integer.parseInt(scanner.nextLine());

                    if (optionNum == 1){
                        // add product to shopping cart
                        Product product = new Product();
                        product.setProductInfo();
                        logInUser.getShoppingCart().setProducts(product);

                    }else if(optionNum == 2){
                        // remove product from shopping cart
                        System.out.println("Enter the name of the product");
                        String productName = scanner.nextLine();
                        logInUser.getShoppingCart().removeProducts(productName);

                    }else if(optionNum == 3){
                        // calculate total cost
                        logInUser.getShoppingCart().calculateTotalCost();

                    }else if(optionNum == 4){
                        // log out process
                        loginOn = false;

                    }else{

                        System.out.println("You entered wrong number!");
                    }
                }
            } else if (optionNum == 3) {
                // terminate the program
                programOn = false;
                System.out.println("Good Bye!!");

            } else{

                System.out.println("You entered wrong number!");

            }
        }
    }
}
