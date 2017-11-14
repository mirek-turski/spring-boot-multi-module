package multi.module1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import multi.module1.service.Module1Service;


@RestController
public class Controller {

    @Autowired
    Module1Service service;
    
    @GetMapping("/module1")
    public String message() {
        return service.message();
    }


}
