package wypychasia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private long Id;

    private String name;
    //przepisac


}
