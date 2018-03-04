
package model;

import java.util.HashMap;

public class Cart {
    
    private final HashMap<Product,Integer> cart;

    public Cart() {
        this.cart = new HashMap<>();
    }

    public HashMap<Product, Integer> getCart() {
        return cart;
    }
    
    public void deleteProduct(Product product){
        if(cart.containsKey(product)) cart.remove(product);
    }
    
    public void addProduct(Product product) {
        if(cart.containsKey(product)) cart.put(product, cart.get(product) + 1);
        else cart.put(product, 1);
    }
    
}
