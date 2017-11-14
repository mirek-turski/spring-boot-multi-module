package multi.module2.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import multi.module2.controller.Controller;

@Configuration
@ConditionalOnProperty(prefix="module2", name={"enabled"}, havingValue="true", matchIfMissing=true)
@ConditionalOnWebApplication
@EnableConfigurationProperties(Module2Properties.class)
public class Module2AutoConfiguration {
    
    @Bean(name="module2Service")
    public Module2Service service(Module2Properties properties) {
        return new Module2Service(properties.getMessage());
    }
    
    @Bean(name="module2Controller")
    public Controller controller() {
        return new Controller();
    }
}
