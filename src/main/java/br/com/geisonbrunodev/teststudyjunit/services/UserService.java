package br.com.geisonbrunodev.teststudyjunit.services;

import br.com.geisonbrunodev.teststudyjunit.domain.User;
import br.com.geisonbrunodev.teststudyjunit.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);

    User update(UserDTO obj);
}
