
package cart;

import frontcontroller.FrontCommand;
import persistence.CartDB;

public class AddCartCommand extends FrontCommand {

    @Override
    public void process() {
        String idProduct = request.getParameter("idProducto");
        
        CartDB.cart.addProduct(Integer.parseInt(idProduct));
        redirect("index.jsp");
    }
    
}
