package multi.module2.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(value={"module2.message=Hello"}, classes={Module2AutoConfiguration.class})
public class Module2ServiceTest {

    @Autowired
    private Module2Service service;

    @Test
    public void contextLoads() {
        assertThat(service.message()).isEqualTo("Hello");
    }

}
