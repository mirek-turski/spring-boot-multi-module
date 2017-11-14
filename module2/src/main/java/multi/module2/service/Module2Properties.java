package multi.module2.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("module2")
public class Module2Properties {

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
