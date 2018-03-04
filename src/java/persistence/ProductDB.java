
package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Product;

public class ProductDB {
    
    public static int productId = 1;
    public static List<Product> products = new ArrayList<>();
    public static boolean isReady = false;
    
    public static int getUniqueId() {
        return productId++;
    }
    
    public static List<Product> getProducts() {
        
        if(isReady) return products;
        
        Random rand = new Random();
        
        for(int i = 0; i < 10; i++) {
            products.add(new Product("http://via.placeholder.com/300X300", "Titulo " + i, "Texto "+ i, rand.nextInt(50) + 1));
        }
        
        isReady = true;
        return ProductDB.products;
    }
    
    public static Product getProduct(int productId) {
        for(Product product : products) {
            if(product.getId() == productId) return product;
        }
        return null;
    }
    
}
