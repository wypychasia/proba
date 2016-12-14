package wypychasia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wypychasia.repository.CodeRepository;

/**
 * Created by wypychasia on 14.12.16.
 */
@Service
public class CodeService {

    @Autowired
    private CodeRepository codeRepository;
}
