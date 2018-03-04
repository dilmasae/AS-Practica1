
package cart;

import frontcontroller.FrontCommand;
import persistence.CartDB;

public class DeleteCartCommand extends FrontCommand {

    @Override
    public void process() {
        String idProduct = request.getParameter("idProducto");
        
        CartDB.cart.deleteProduct(Integer.parseInt(idProduct));
        redirect("cart.jsp");
    }
    
}
