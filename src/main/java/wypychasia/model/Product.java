package wypychasia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

/**
 * Created by wypychasia on 14.12.16.
 */
@Entity
public class Product {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long product_id;

    private String product_name;

    private float version_number;

    @ManyToOne
    private Company company;



}
