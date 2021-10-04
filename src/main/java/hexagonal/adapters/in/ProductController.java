package hexagonal.adapters.in;

import hexagonal.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import hexagonal.ports.in.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<List<Product>>(productService.getProducts(), HttpStatus.OK);
    }
    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer productId){
        return new ResponseEntity<Product>(productService.getProductID(productId), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<String> removeProduct(@PathVariable Integer productId){
        return new ResponseEntity<String>(productService.removeProduct(productId), HttpStatus.OK);
    }
}
