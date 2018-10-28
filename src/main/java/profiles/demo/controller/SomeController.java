package profiles.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import profiles.demo.config.EnvConf;
import profiles.demo.service.IService;

@RestController
public class SomeController {

    @Autowired
    private EnvConf envConf;

    @Autowired
    IService service;


    @GetMapping(path = "/check")
    public String getSample() {
        service.operation();

        return envConf.checkVal();
    }
}
