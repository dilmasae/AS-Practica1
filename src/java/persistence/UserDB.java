
package persistence;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.User;

public class UserDB {
    
    public static int userId = 1;
    public static List<User> users = new ArrayList<>(
            Arrays.asList(new User("Edilma", "Alvaro", "04/12/1989", "dilmasae@gmail.com", "123"))
    );
    
    public static int getUniqueId() {
        return userId++;
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
