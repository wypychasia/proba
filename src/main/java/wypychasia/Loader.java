package wypychasia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import wypychasia.repository.CompanyRepository;
import wypychasia.repository.UserRepository;

import javax.annotation.PostConstruct;

/**
 * Created by wypychasia on 05.12.16.
 */
public class Loader {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @PostConstruct
    @Transactional
    public void run() {
        /*for(int i=0; i<100; i++) {
            UserAccount user = new UserAccount();
            Code code = new Code();
            Company company = new Company();
            Module module = new Module();
            Product product = new Product();
            Information info = new Information();
            company.setCompany_name("firma ");
            company.setNIP_number(1234567890);
            company.setVAT(true);
            company.setAddress_city("Warsaw");
            company.setAddress_street("Polna");
            company.setAddress_number(3);
            company.setAddress_postalCode("02-122");
            company.setContact_number("123-456-789");
            //company.setUserAccount(user);
            user.setLogin("aaa");
            user.setPassword("aaa");
            //user.setCompany(company);
            userRepository.save(user);
            companyRepository.save(company);
        }*/


        System.out.println("hello");
    }
}
