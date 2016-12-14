package wypychasia.model;

import javax.persistence.*;

/**
 * Created by wypychasia on 01.12.16.
 */
//@Getter -> lombok
//@Setter
@Entity
//@ToString
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long company_id;

    private int NIP_number;

    private String company_name;

    private boolean VAT;

    private String address_city;

    private String address_street;

    private String address_postalCode;

    private int address_number;

    private String contact_number;

    private String comments;

    @OneToMany
    private UserAccount userAccount;





}
