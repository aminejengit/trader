package com.jen.soccer.trader;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigsLoadTest {
    @Autowired
    DataProvidersConfigs dataProvidersConfigs;
    @Test
    public void TestLoadedConfigs(){
        Assert.assertEquals(dataProvidersConfigs.getProtocol(),"http");
    }
}
