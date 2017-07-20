package cn.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by ShuangWang on 2017/7/11.
 */
public class DoTest {
    @Test
    public void testIOC() throws Exception {
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("resources/bean.xml");
        Person person = (Person) ac.getBean("person1");
        System.out.println(person);
    }
}
