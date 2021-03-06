package com.asierg.wsclientcxf;

import static org.assertj.core.api.Assertions.assertThat;

import com.asierg.wsclientcxf.ws.HelloWorldClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class WsclientCxfApplicationTests {

    @Autowired
    private HelloWorldClient helloWorldClient;

    @Test
    public void testSayHello() {
        assertThat(helloWorldClient.sayHello("Axier", "Garcia"))
                .isEqualTo("Kaixo Axier Garcia!");
    }

}
