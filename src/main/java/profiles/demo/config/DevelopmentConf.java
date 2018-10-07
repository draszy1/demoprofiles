package profiles.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevelopmentConf implements EnvConf {

    @Value("${dev.val}")
    private String devVal;

    public String checkVal() {
        return devVal;
    }

}
