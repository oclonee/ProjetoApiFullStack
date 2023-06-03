package br.com.fullstackapi.project.domain.service;

import br.com.fullstackapi.project.domain.model.User;
import br.com.fullstackapi.project.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> allUsers(){
        return userRepository.findAll();
    }
    public User save(User user){
        return userRepository.save(user);
    }
}
