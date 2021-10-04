package hexagonal.adapters.out;

import hexagonal.domain.Product;
import hexagonal.domain.jpa.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import hexagonal.ports.out.ProductRepository;

import java.util.List;

@Repository
public class ProductRepositoryImp implements ProductRepository{
    @Autowired
    private ProductInterface productInterface;

    @Override
    public List<Product> getProducts() {
        return productInterface.findAll();
    }

    @Override
    public Product getProductByID(Integer productID) {
        return productInterface.getById(productID);
    }

    @Override
    public Product addProduct(Product product) {
        return productInterface.save(product);
    }

    @Override
    public String removeProduct(Integer productID) {
        productInterface.deleteById(productID);
        return  "product removed";
    }
}
