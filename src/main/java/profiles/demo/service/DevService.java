package profiles.demo.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class DevService implements IService {

    @Override
    public void operation() {
        System.out.println("Hellloooooooo DEV!!!!!");
    }
}
