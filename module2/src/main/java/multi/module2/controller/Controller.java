package multi.module2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import multi.module2.service.Module2Service;


@RestController
public class Controller {

    @Autowired
    Module2Service service;
    
    @GetMapping("/module2")
    public String message() {
        return service.message();
    }


}
