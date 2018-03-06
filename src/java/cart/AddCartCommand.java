
package cart;

import frontcontroller.FrontCommand;
import javax.servlet.http.HttpSession;
import model.Cart;

public class AddCartCommand extends FrontCommand {

    @Override
    public void process() {
        String idProduct = request.getParameter("idProducto");
        
        HttpSession session = request.getSession();
        
        Cart cart = (Cart) session.getAttribute(CART_KEY);
        
        if(cart != null) cart.addProduct(Integer.parseInt(idProduct));
        else {
            Cart newCart = new Cart();
            newCart.addProduct(Integer.parseInt(idProduct));
            session.setAttribute(CART_KEY, newCart);
        }
        
        redirect("index.jsp");
    }
    
}
