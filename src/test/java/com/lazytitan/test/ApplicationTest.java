package com.lazytitan.test;

import com.lazytitan.ApplicationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author liubojin on 2018/1/15 18:58
 */
@RunWith(SpringJUnit4ClassRunner.class)                     /* 使用JUnit测试工具 */
@SpringApplicationConfiguration(classes = ApplicationConfig.class)  /* 通过spring boot 加载上下文*/
@WebAppConfiguration
public class ApplicationTest {

    @Test
    public void contextLoads() {

    }
}
