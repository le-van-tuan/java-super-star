package vn.sps;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import vn.sps.configs.DummyProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringApplicationTest {

    private static final String NEW_APPLICATION_NAME = "RobinApp";

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Test
    public void givenSingletonScope_whenSetName_thenEqualNames() {
        DummyProperties dummyProperties = applicationContext.getBean(DummyProperties.class);
        dummyProperties.setApplicationName(NEW_APPLICATION_NAME);

        DummyProperties dummyProperties2 = applicationContext.getBean(DummyProperties.class);
        Assert.assertEquals(NEW_APPLICATION_NAME, dummyProperties2.getApplicationName());
    }

    @Test
    public void givenPrototypeScope_whenSetNames_thenDifferentNames() {
        DummyProperties dummyProperties = applicationContext.getBean(DummyProperties.class);
        dummyProperties.setApplicationName(NEW_APPLICATION_NAME);

        DummyProperties dummyProperties2 = applicationContext.getBean(DummyProperties.class);
        Assert.assertNotEquals(NEW_APPLICATION_NAME, dummyProperties2.getApplicationName());
    }
}
