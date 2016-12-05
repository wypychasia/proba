package wypychasia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import wypychasia.model.Uzytkownik;
import wypychasia.repository.UserRepository;

import javax.annotation.PostConstruct;

/**
 * Created by wypychasia on 05.12.16.
 */
public class Loader {
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    @Transactional
    public void run() {
        for(int i=0; i<100; i++) {
            Uzytkownik user = new Uzytkownik();
            user.setLogin("aaa");
            user.setPassword("aaa");
            userRepository.save(user);
        }


        System.out.println("hello");
    }
}
