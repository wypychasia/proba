package wypychasia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wypychasia.model.Product;

/**
 * Created by wypychasia on 14.12.16.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
