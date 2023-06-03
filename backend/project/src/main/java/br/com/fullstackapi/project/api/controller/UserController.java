package br.com.fullstackapi.project.api.controller;

import br.com.fullstackapi.project.domain.model.User;
import br.com.fullstackapi.project.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController{
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> users(){
        return userService.allUsers();
    }
    @PostMapping
    public ResponseEntity<User> user(@RequestBody User user){
        if(user!= null) {
            User newUser = userService.save(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
        }
        return ResponseEntity.badRequest().build();
    }
}
