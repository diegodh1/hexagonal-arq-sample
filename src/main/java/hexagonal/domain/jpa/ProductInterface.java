package hexagonal.domain.jpa;

import hexagonal.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInterface extends JpaRepository<Product,Integer> {
}
