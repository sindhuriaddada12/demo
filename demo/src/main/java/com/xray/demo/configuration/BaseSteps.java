package com.xray.demo.configuration;



import com.xray.demo.DemoApplication;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//@RunWith(SpringJUnit4ClassRunner.class)
//@BootstrapWith(SpringBootTestContextBootstrapper.class)
//@Configuration
//@ConfigurationProperties(prefix = "demo")


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DemoApplication.class, loader = SpringBootContextLoader.class)
@SpringBootTest

public abstract class BaseSteps {
//
//    @Autowired
//    private ApplicationTestProperties applicationTestProperties;

    @Value("${demo.endpoint}")
    String endpoint;

    public String getEndpoint(){

        return this.endpoint;
    }




}
