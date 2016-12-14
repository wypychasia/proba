package wypychasia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

/**
 * Created by wypychasia on 14.12.16.
 */
@Entity
public class Module {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long module_id;

    private String module_name;

    private float version;

    @ManyToOne
    private Product module_product;


}
