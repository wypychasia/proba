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

    private String license_number;

    @ManyToOne
    private UserAccount userAccount;

    public int getNIP_number(){return NIP_number;}
    public void setNIP_number(int NIP_number){ this.NIP_number=NIP_number;}

    public String getCompany_name(){return company_name;}
    public void setCompany_name(String company_name){this.company_name = company_name;}

    public boolean getVAT(){return VAT;}
    public void setVAT(boolean VAT){ this.VAT = VAT;}

    public String getAddress_city(){return address_city;}
    public void setAddress_city(String address_city){this.address_city=address_city;}

    public String getAddress_street(){return address_street;}
    public void setAddress_street(String address_street){this.address_street=address_street;}

    public int getAddress_number(){return address_number;}
    public void setAddress_number(int address_number){this.address_number=address_number;}

    public String getAddress_postalCode(){return address_postalCode;}
    public void setAddress_postalCode(String address_postalCode){this.address_postalCode=address_postalCode;}

    public String getContact_number(){return contact_number;}
    public void setContact_number(String contact_number){this.contact_number=contact_number;}

    public String getComments(){return comments;}
    public void setComments(String comments){this.comments=comments;}

    public String getLicense_number(){return license_number;}
    public void setLicense_number(String license_number){this.license_number=license_number;}

    public UserAccount getUserAccount(){return userAccount;}
    public void setUserAccount(UserAccount userAccount){this.userAccount=userAccount;}
}
