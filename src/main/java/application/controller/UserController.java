package application.controller;

import application.data.entity.User;
import application.data.entity.UserSignUp;
import application.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/signup")
    public User saveUser(@RequestBody UserSignUp user) {
        System.out.println("New user: " + user.getUsername());
        return userService.save(user);
    }

    @PreAuthorize(RoleConstants.USER)
    @GetMapping
    public List<User> getUsers(){
        return userService.findAll();
    }

    @PreAuthorize(RoleConstants.USER)
    @GetMapping("/{username}")
    public User getOne(@PathVariable String username){
        return userService.findByName(username);
    }

    @PreAuthorize(RoleConstants.USER)
    @PutMapping
    public User update(@RequestBody User user){
        return userService.update(user);
    }
}
