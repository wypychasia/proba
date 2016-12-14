package wypychasia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wypychasia.model.Information;

/**
 * Created by wypychasia on 14.12.16.
 */
public interface InformationRepository extends JpaRepository<Information, Long> {
}
