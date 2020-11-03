package application.data.service;

import application.data.entity.Form;

import java.util.List;

public interface FormService {
    Form save(Form form);

    Form findById(Long id);

    List<Form> findAll();

    Form update(Form form);
}
