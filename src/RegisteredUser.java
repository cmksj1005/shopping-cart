import java.util.Scanner;

 class RegisteredUser extends User{

     Scanner scanner = new Scanner(System.in);

    public RegisteredUser() {
    }

    public void setRegisteredUserInfo(){
        // Ask user info to the user and set the info to User class
        String userId, userName, userAddress;

        System.out.println("Create user ID:");
        userId = scanner.nextLine();
        System.out.println("Enter user Name:");
        userName = scanner.nextLine();
        System.out.println("Enter user Address:");
        userAddress = scanner.nextLine();

        setId(userId);
        setName(userName);
        setAddress(userAddress);
    }


}
