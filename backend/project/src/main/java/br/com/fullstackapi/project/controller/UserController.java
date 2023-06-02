package br.com.fullstackapi.project.controller;

import br.com.fullstackapi.project.DAO.IUSer;
import br.com.fullstackapi.project.model.User;
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
    private IUSer dao;
    @GetMapping
    public List<User> users(){
        return (List<User>) dao.findAll();
    }
    @PostMapping
    public ResponseEntity<User> user(@RequestBody User user){
        if(user!= null) {
            User newUser = dao.save(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
        }
        return ResponseEntity.badRequest().build();
    }
}
