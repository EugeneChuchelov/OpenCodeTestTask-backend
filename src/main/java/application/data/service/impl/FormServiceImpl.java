package application.data.service.impl;

import application.data.entity.Form;
import application.data.repository.FormRepository;
import application.data.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service(value = "formService")
public class FormServiceImpl implements FormService {

    @Autowired
    private FormRepository formRepository;

    @Override
    public Form save(Form form) {
        Form newForm = new Form(
                form.getTitle(), form.getCreator(),
                LocalDateTime.now(), form.getQuestions()
        );
        return formRepository.save(newForm);
    }

    @Override
    public Form findById(Long id) {
        return formRepository.findById(id).orElse(null);
    }

    @Override
    public List<Form> findAll() {
        return formRepository.findAll();
    }

    @Override
    public Form update(Form form) {
        return formRepository.save(form);
    }
}
