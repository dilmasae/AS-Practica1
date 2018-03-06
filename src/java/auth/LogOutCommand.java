
package auth;

import frontcontroller.FrontCommand;
import javax.servlet.http.HttpSession;
import model.User;
import persistence.CartDB;


public class LogOutCommand extends FrontCommand {

    @Override
    public void process() {
        HttpSession session = request.getSession(false);
        
        if(session != null){
            User user = (User) session.getAttribute("user");    
            session.invalidate();
        }
        
        // Borrar el carrito
        CartDB.cart.clear();
        
        redirect("index.jsp");
    }
    
}
