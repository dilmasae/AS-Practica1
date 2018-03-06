
package auth;

import frontcontroller.FrontCommand;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.User;


public class LogOutCommand extends FrontCommand {

    @Override
    public void process() {
        HttpSession session = request.getSession(false);
        
        if(session != null){
            User user = (User) session.getAttribute(USER_KEY);    
            
            // Borrar el carrito
            Cart cart = (Cart) session.getAttribute(CART_KEY);
            
            if(cart != null) {
                cart.clear();
                session.setAttribute(CART_KEY, cart);
            }
            
            session.invalidate();
        }
        
        redirect("index.jsp");
    }
    
}
