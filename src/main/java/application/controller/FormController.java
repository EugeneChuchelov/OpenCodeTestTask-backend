package application.controller;

import application.data.entity.*;
import application.data.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/form")
public class FormController {

    @Autowired
    FormService formService;

    @PreAuthorize(RoleConstants.ADMIN)
    @PostMapping
    public Form saveForm(@RequestBody Form form){
        return formService.save(form);
    }

    @PreAuthorize(RoleConstants.USER)
    @GetMapping
    public List<Form> getAll(){
        List<Form> forms = formService.findAll();
        return forms;
    }

    @PreAuthorize(RoleConstants.USER)
    @GetMapping("/{id}")
    public Form getOne(@PathVariable Long id){
        return formService.findById(id);
    }

    @PreAuthorize(RoleConstants.ADMIN)
    @PutMapping
    public Form updateForm(@RequestBody Form form){
        return formService.update(form);
    }
}
