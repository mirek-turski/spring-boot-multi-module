package multi.module1.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(value={"module1.message=Hello"}, classes={Module1AutoConfiguration.class})
public class Module1ServiceTest {

    @Autowired
    private Module1Service service;

    @Test
    public void contextLoads() {
        assertThat(service.message()).isEqualTo("Hello");
    }

}
