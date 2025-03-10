package br.com.geisonbrunodev.teststudyjunit.repositories;

import br.com.geisonbrunodev.teststudyjunit.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
