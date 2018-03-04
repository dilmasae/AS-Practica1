
package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Cart;
import model.Product;

public class ProductDB {
    
    public static Cart cart = new Cart();
    
    public static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        
        Random rand = new Random();
        
        for(int i = 0; i < 10; i++) {
            products.add(new Product("http://via.placeholder.com/300X300", "Titulo " + i, "Texto "+ i, rand.nextInt(50) + 1));
        }
        
        return products;
    }
    
}
