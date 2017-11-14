package multi.module2.service;

import org.springframework.stereotype.Component;

@Component
public class Module2Service {

    private final String message;

    public Module2Service(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
