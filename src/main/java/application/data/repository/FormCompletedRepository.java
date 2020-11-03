package application.data.repository;

import application.data.entity.FormCompleted;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FormCompletedRepository extends JpaRepository<FormCompleted, Long> {
    FormCompleted save(FormCompleted form);

    Optional<FormCompleted> findById(Long id);

    List<FormCompleted> findAll();

    List<FormCompleted> findByCompleter(String completer);
}
