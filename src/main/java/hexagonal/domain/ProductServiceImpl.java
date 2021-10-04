package hexagonal.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hexagonal.ports.in.ProductService;
import hexagonal.ports.out.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    @Override
    public Product getProductID(Integer productID) {
        return productRepository.getProductByID(productID);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
    }

    @Override
    public String removeProduct(Integer productID) {
        return productRepository.removeProduct(productID);
    }
}
