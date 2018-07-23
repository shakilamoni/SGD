package com.zcw.passionproject.sgd.com.zcw.passionproject.sgd.controller;

import com.zcw.passionproject.sgd.com.zcw.passionproject.sgd.repository.UserRepository;
import com.zcw.passionproject.sgd.entity.User;
import javassist.tools.web.BadHttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserController {

        @Autowired
        private UserRepository repository;

        //optional?
        public UserController (UserRepository repository){
            this.repository = repository;
    }
        @GetMapping
        public Iterable<User> findAll() {
            return repository.findAll();
        }

        //"/customers/{id}")
        @GetMapping(path = "/users/{email}")
        public User find(@PathVariable(value = "email") String email) {
            return repository.findByEmail(email);
        }

        @PostMapping(consumes = "application/json")
        public User create(@RequestBody User user) {
            return repository.save(user);
        }

        @DeleteMapping(path = "/{email}")
        public void delete(@PathVariable("email") String email) {
            repository.deleteByEmail(email);
        }

        @PutMapping(path = "/{email}")
        public User update(@PathVariable("email") String email, @RequestBody User user) throws BadHttpRequest {
            if (repository.existsByEmail(email)) {
                user.setEmail(email);
                return repository.save(user);
            } else {
                throw new BadHttpRequest();
            }
        }

    }

