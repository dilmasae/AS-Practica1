
package persistence;

import java.util.HashMap;
import model.Cart;

public class CartDB {
    
    public static HashMap<Integer, Integer> cart = new Cart().getCart();
    
}
