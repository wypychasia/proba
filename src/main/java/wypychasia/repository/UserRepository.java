package wypychasia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wypychasia.model.Uzytkownik;

/**
 * Created by wypychasia on 05.12.16.
 */
public interface UserRepository extends JpaRepository<Uzytkownik, Long>{
    //List<User> findAllByLogin(String login);
}
