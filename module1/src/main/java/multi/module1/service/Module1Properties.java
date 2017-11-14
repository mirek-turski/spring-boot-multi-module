package multi.module1.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("module1")
public class Module1Properties {

    /**
     * A message for the service.
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
