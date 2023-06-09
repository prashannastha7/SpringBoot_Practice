package com.practise.SpringBoot_Rest.user;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){

        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);
        // For exception
        if(user == null)
            throw new UserNotFoundException("id-" + id);
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser( /*@Valid*/ @RequestBody User user) {
        User savedUser = service.save(user);

        //for location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        User user = service.deleteById(id);
        // For exception
        if(user == null)
            throw new UserNotFoundException("id-" + id);
    }
}
