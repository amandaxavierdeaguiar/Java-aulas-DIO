package dio.datajpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.datajpa.modelo.User;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Amanda");
        user.setUsername("aguiarxmanda");
        user.setPassword("estudos");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
