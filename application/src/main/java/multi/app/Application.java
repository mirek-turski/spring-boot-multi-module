package multi.app;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
        builder
        .initializers(new CustomAppContextInitializer())
//        .beanNameGenerator(new DefaultBeanNameGenerator())
        .build().run(args);
    }

}

class CustomAppContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext context) {
        // Make sure that beans with the same name are not overridden, as it may lead to
        // some inconsistencies given that the modules are auto configured.
        if (context.getBeanFactory() instanceof DefaultListableBeanFactory) {
            ((DefaultListableBeanFactory)context.getBeanFactory()).setAllowBeanDefinitionOverriding(false);
        }
    }

}
