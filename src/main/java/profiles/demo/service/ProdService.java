package profiles.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdService implements IService {
    @Override
    public void operation() {
        System.out.println("Hellooooooo PROD!");
    }
}
