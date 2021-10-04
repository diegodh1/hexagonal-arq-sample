package hexagonal.ports.in;

import hexagonal.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getProducts();
    Product getProductID(Integer productID);
    Product addProduct(Product product);
    String removeProduct(Integer productID);
}
