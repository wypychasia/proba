package wypychasia.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import wypychasia.model.UserAccount;
import wypychasia.service.UserService;

import java.util.List;

/**
 * Created by wypychasia on 07.11.16.
 */
@org.springframework.stereotype.Controller
public class Controller {


    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/main")
    public String main(Model model) {
        List<UserAccount> lista = userService.findAllUser();
        model.addAttribute("listaUzytkownikow", lista);
        return "main";
    }
}
