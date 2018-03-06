
package auth;

import frontcontroller.FrontCommand;
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
             
             int expireTime = 86400; // un dia en segundos
             session.setMaxInactiveInterval(expireTime);
             session.setAttribute("user", user);
             
             redirect("index.jsp");
        }
        else {
            request.setAttribute("error", "Credenciales invalidas");
            forward("/login.jsp");
        }
        
    }
    
}
