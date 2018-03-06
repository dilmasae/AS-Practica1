
package persistence;

import java.util.ArrayList;
import java.util.List;
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
        
        products.add(new Product("https://images.pexels.com/photos/326583/pexels-photo-326583.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb",
                "Zapatitos de bebé " , "Lindos zapatitos tejidos a mano.", 35));
        
        products.add(new Product("https://images.pexels.com/photos/45223/gift-made-surprise-loop-45223.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb",
                "Cajas de regalo " , " Pequeñas cajas de regalo .", 3));
        
        products.add(new Product("https://images.pexels.com/photos/533604/pexels-photo-533604.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb",
                "Corazones" , "Pequeños corazones ideales para regalar", 5));
        
        
        products.add(new Product("https://images.pexels.com/photos/898322/pexels-photo-898322.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb",
                "Galletas decoradas" , "Galletas decoradas para regalar", 6));
        
        
        products.add(new Product("https://images.pexels.com/photos/268364/pexels-photo-268364.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb",
                "Cupcake decorativas" , " Cupcake de papel ideals para reagalar ", 3));
        
        products.add(new Product("https://images.pexels.com/photos/68558/pexels-photo-68558.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb",
                "Flores de papel " , "Ideales para regalar ", 1));
        
        products.add(new Product("https://images.pexels.com/photos/220987/pexels-photo-220987.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb",
                "Florero azul" , "Florero artesanal hecho a mano", 45));
        
        products.add(new Product("https://images.pexels.com/photos/255380/pexels-photo-255380.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb",
                "Bola decorativa" , "lorem lorem lorem lorem", 3));
        
        products.add(new Product("https://images.pexels.com/photos/730919/christmas-tree-christmas-tree-decoration-730919.jpeg?w=1260&h=750&dpr=2&auto=compress&cs=tinysrgb",
                "Estrellas de navidad" , "lorem lorem lorem lorem", 3));
        

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
