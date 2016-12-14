package wypychasia.model;

import javax.persistence.*;

/**
 * Created by wypychasia on 05.12.16.
 */
@Entity
public class UserAccount {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;

    private String login;

    private String password;

    @ManyToOne
    private Company company;

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

    public long getId() {
        return user_id;
    }

    public void setId(long id) {
        user_id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
