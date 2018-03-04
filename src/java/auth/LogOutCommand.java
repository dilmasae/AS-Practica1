
package auth;

import frontcontroller.FrontCommand;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import model.User;


public class LogOutCommand extends FrontCommand {

    @Override
    public void process() {
        HttpSession session = request.getSession(false);
        Cookie[] cookies = request.getCookies();
        
        if(session != null){
            
            User user = (User) session.getAttribute("user");
        
            if(user != null) {
                if (cookies != null) {
                    for (Cookie cookie : cookies) {
                        if (cookie.getName().equals(user.getEmail())) {
                            cookie.setMaxAge(0);
                            cookie.setPath("/");
                            break;
                        }
                    }
                }
            }
            
            session.invalidate();
            
        }
        
        redirect("/index.jsp");
    }
    
}
