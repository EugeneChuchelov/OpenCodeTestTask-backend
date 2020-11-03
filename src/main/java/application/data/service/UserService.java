package application.data.service;

import application.data.entity.User;
import application.data.entity.UserSignUp;

import java.util.List;

public interface UserService {
    User save(UserSignUp user);

    List<User> findAll();

    User findByName(String name);

    User update(User user);
}
