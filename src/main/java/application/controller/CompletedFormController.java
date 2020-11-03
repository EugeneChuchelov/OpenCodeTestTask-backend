package application.controller;

import application.data.entity.FormCompleted;
import application.data.service.FormCompletedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/form/completed")
public class CompletedFormController {
    @Autowired
    FormCompletedService formCompletedService;

    @PreAuthorize(RoleConstants.USER)
    @PostMapping
    public FormCompleted saveForm(@RequestBody FormCompleted form) {
        return formCompletedService.save(form);
    }

    @PreAuthorize(RoleConstants.ADMIN)
    @GetMapping("/{username}")
    public List<FormCompleted> getAll(@PathVariable String username) {
        List<FormCompleted> forms = formCompletedService.findByUsername(username);
        return forms;
    }
}
