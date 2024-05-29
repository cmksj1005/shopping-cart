import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> users;

    public Users() {
        // ArrayList to save all the user information
        this.users = new ArrayList<>();
    }

    public void setUsers(User user){
        this.users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public User searchUserInfo(String userId){
        // search for a user using user id
        for (User user : this.users){
            if(user.getId().equals(userId)){
                return user; // return the user
            }
        }
        return null; // return null if user is not found
    }

    @Override
    public String toString() {
        return "Users{" +
                "users=" + users +
                '}';
    }
}
