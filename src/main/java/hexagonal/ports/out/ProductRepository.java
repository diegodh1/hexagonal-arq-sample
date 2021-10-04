package hexagonal.ports.out;

import hexagonal.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getProducts();
    Product getProductByID(Integer productID);
    Product addProduct(Product product);
    String removeProduct(Integer productID);
}
