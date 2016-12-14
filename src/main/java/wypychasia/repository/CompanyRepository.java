package wypychasia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wypychasia.model.Company;

/**
 * Created by wypychasia on 14.12.16.
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
