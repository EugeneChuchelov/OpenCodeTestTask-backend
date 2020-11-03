package application.data.repository;

import application.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    User save(User user);

    @Override
    List<User> findAll();

    User findByUsername(String username);

    @Override
    Optional<User> findById(Long id);

    @Override
    void delete(User user);
}
