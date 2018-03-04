
package auth;

import frontcontroller.FrontCommand;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import model.User;
import persistence.UserDB;


public class LoginCommand extends FrontCommand {

    @Override
    public void process() {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        User user = UserDB.getUser(email, password);
        
        if(user != null) {
             HttpSession session = request.getSession();
             
             int expireTime = 30 * 60;
             session.setMaxInactiveInterval(expireTime);
             
             session.setAttribute("user", user);
             Cookie cookieUser = new Cookie("user", user.getEmail());
             cookieUser.setMaxAge(expireTime);
             
             response.addCookie(cookieUser);
             redirect("index.jsp");
        }
        else {
            request.setAttribute("message", "Credenciales invalidas");
            forward("/login.jsp");
        }
        
    }
    
}
