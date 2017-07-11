package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by ShuangWang on 2017/7/11.
 */
public class DoTest {
    @Test
    public void testIOC() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/bean.xml");
        Person person = (Person) context.getBean("person1");
        System.out.println(person);
    }
}
