package application.data.service;

import application.data.entity.FormCompleted;

import java.util.List;

public interface FormCompletedService {
    FormCompleted save(FormCompleted form);

    List<FormCompleted> findByUsername(String username);
}
