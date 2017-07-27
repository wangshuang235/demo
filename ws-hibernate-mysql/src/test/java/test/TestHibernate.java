package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import cn.ws.entites.Person;


/**
 * Created by ShuangWang on 2017/7/20.
 */
public class TestHibernate {
    @Test
    public void testIOC() throws Exception {
        //加载spring配置文件
        Person person = new Person();
        person.setName("ws");
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        SessionFactory sf = config.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(person);

        tx.commit();

        session.close();
        sf.close();
    }
}
