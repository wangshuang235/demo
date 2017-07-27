package test;

import cn.ws.entites.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ShuangWang on 2017/7/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/bean.xml"})
public class TestIOC {
    @Autowired
    private Person person1;
    @Test
    public void testIOC() throws Exception {
        System.out.println(person1.getName());
    }
}
