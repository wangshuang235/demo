import cn.ws.mybatis.dao.TestDao;
import cn.ws.mybatis.entities.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;

/**
 * Created by ShuangWang on 2017/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath*:/bean.xml"})
public class test {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Test
    public void test1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Person person = new Person();
        person.setName("Jack");
        int i = sqlSession.insert("Person.add", person);
        System.out.println(i);
    }
}
