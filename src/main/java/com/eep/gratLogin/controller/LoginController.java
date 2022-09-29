package com.eep.gratLogin.controller;


import com.eep.model.LoginUser;
import com.eep.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @PostMapping("/stub/login")
    public ResponseEntity<User> loginPage(@RequestBody LoginUser loginuser) {
        return new ResponseEntity<>(new User("abc123","Candidate"), HttpStatus.OK) ;
    }


}
