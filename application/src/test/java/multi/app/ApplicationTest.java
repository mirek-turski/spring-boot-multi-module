package multi.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import multi.module1.controller.Controller;
//import multi.module2.controller.Module2Controller;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private Controller module1Controller;

//    @Autowired
//    private Module2Controller module2Controller;

    @Test
    public void contextLoads() {
        assertThat(module1Controller).isNotNull();
//        assertThat(module2Controller).isNotNull();
    }

}
