package wypychasia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

/**
 * Created by wypychasia on 14.12.16.
 */
@Entity
public class Information {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long information_id;

    private String info_type;

    private String info_content;

    @ManyToOne
    private Code code_id;
}
