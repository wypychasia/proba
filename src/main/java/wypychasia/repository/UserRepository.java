package wypychasia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wypychasia.model.UserAccount;

/**
 * Created by wypychasia on 05.12.16.
 */
public interface UserRepository extends JpaRepository<UserAccount, Long>{
    //List<User> findAllByLogin(String login);
}
