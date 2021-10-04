package hexagonal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {
    @Id
    private Integer productID;
    private String type;
    private String description;

    public Integer getProductID() {
        return productID;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
