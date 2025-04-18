package br.com.geisonbrunodev.teststudyjunit.config;

import br.com.geisonbrunodev.teststudyjunit.domain.User;
import br.com.geisonbrunodev.teststudyjunit.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void startDB() {
        User u1 = new User(null, "Geison", "geison@gmail.com", "123456");
        User u2 = new User(null, "Bruno", "bruno@gmail.com", "123456");

        userRepository.saveAll(List.of(u1, u2));
    }
}
