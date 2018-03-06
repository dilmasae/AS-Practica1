
package cart;

import frontcontroller.FrontCommand;
import javax.servlet.http.HttpSession;
import model.Cart;

public class DeleteCartCommand extends FrontCommand {

    @Override
    public void process() {
        String idProduct = request.getParameter("idProducto");
        
        HttpSession session = request.getSession();
        
        Cart cart = (Cart) session.getAttribute(CART_KEY);
        
        if(cart != null) cart.deleteProduct(Integer.parseInt(idProduct));
        
        redirect("cart.jsp");
    }
    
}
