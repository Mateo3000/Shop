package entity;

import entity.Product;
import java.util.List;

public interface ProductDao {
    void saveProduct (Product product);
    void saveProduct (List<Product> products);
    void removeProductById(Long productId);
    void removeProductByName(String productName);
    Product getAllProducts();
    Product getProductById(Long productId);
    Product getProductByProductName(String productName);



}
