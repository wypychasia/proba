package wypychasia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wypychasia.model.Uzytkownik;
import wypychasia.repository.UserRepository;

import java.util.List;

/**
 * Created by wypychasia on 05.12.16.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Uzytkownik> findAllUser(){
        return userRepository.findAll();
    }
}
