package com.example.example_docker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("<h1>Hello Your app is successfully Deployed on K8s</h1>", HttpStatus.OK);
    }

}
