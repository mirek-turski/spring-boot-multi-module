package multi.module1.service;

import org.springframework.stereotype.Component;

@Component
public class Module1Service {

    private final String message;

    public Module1Service(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
