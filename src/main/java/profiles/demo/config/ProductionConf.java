package profiles.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProductionConf implements EnvConf {

    @Value("${prod.val}")
    private String prodVal;

    public String checkVal() {
        return prodVal;
    }

}
