package application.data.repository;

import application.data.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FormRepository extends JpaRepository<Form, Long> {

    @Override
    Form save(Form form);

    @Override
    Optional<Form> findById(Long id);

    @Override
    List<Form> findAll();

    @Override
    void deleteById(Long aLong);
}
