package profiles.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import profiles.demo.config.EnvConf;

@RestController
public class ProdController {

    @Autowired
    private EnvConf envConf;


    @GetMapping(path = "/check")
    public String getSample() {
        return envConf.checkVal();
    }
}
