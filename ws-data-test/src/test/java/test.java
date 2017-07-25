import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ws.test.dao.TestMapper;
import ws.test.entities.Person;

import java.util.List;

/**
 * Created by ShuangWang on 2017/7/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath*:/spring-contexts/*.xml"})
public class test {
    @Autowired
    private TestMapper testMapper;
    @Test
    public void test1() {
        List<Person> persons = testMapper.findAll();
        System.out.println(persons.size());
    }
}
