package wypychasia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

/**
 * Created by wypychasia on 14.12.16.
 */
@Entity
public class Code {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long code_id;

    private String code_content;

   @ManyToOne
   private Product product_id;
}
