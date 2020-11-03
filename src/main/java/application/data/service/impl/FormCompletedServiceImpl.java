package application.data.service.impl;

import application.data.entity.FormCompleted;
import application.data.repository.FormCompletedRepository;
import application.data.service.FormCompletedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service(value = "formCompletedService")
public class FormCompletedServiceImpl implements FormCompletedService {
    @Autowired
    private FormCompletedRepository formCompletedRepository;

    @Override
    public FormCompleted save(FormCompleted form) {
        FormCompleted completed = new FormCompleted(
                form.getTitle(), form.getCreator(), form.getCompleter(), form.getCreated_at(),
                LocalDateTime.now(), form.getQuestions()
        );
        return formCompletedRepository.save(completed);
    }

    @Override
    public List<FormCompleted> findByUsername(String username) {
        return formCompletedRepository.findByCompleter(username);
    }
}
