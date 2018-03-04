
package persistence;


import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserDB {
    
    public static int id = 1;
    public static List<User> users = new ArrayList<>();
    
    public static int getUniqueId() {
        return id++;
    }
    
    public static void add(User user) {
        if(!users.contains(user)) users.add(user);
    }
    
    public static User getUser(String email, String password) {
        for(User user : users) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password)) return user;
        }
        return null;
    }
    
}
