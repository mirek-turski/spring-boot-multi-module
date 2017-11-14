package multi.module1.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import multi.module1.controller.Controller;
import multi.module1.service.Module1Properties;
import multi.module1.service.Module1Service;

@Configuration
@ConditionalOnProperty(prefix="module1", name={"enabled"}, havingValue="true", matchIfMissing=true)
@ConditionalOnWebApplication
@EnableConfigurationProperties(Module1Properties.class)
public class Module1AutoConfiguration {
    
    @Bean
    public Module1Service service(Module1Properties properties) {
        return new Module1Service(properties.getMessage());
    }
    
    @Bean
    public Controller controller() {
        return new Controller();
    }
}
