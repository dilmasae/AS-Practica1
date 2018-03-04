
package model;

import java.util.HashMap;

public class Cart {
    
    /*
     * Primer Integer   => id del productor
     * Segundo Integer  => cantidad
    */
    private HashMap<Integer,Integer> cart;

    public Cart() {
        this.cart = new HashMap<>();
    }

    public HashMap<Integer, Integer> getCart() {
        return cart;
    }
    
    public void deleteProduct(Integer id){
        if(cart.containsKey(id)) cart.remove(id);
    }
    
    public void addProduct(Integer id) {
        if(cart.containsKey(id)) cart.put(id, cart.get(id) + 1);
        else cart.put(id, 1);
    }
    
    public void clear() {
        cart = new HashMap<>();
    }
    
}
