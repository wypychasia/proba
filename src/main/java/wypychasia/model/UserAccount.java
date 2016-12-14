package wypychasia.model;

import javax.persistence.*;

/**
 * Created by wypychasia on 05.12.16.
 */
@Entity
public class UserAccount {

    private Long id;
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId(){return id;}

    public void setId(Long id){this.id=id;}

    private String login;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


}
