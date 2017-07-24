import cn.ws.mybatis.dao.TestDao;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ShuangWang on 2017/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath*:/bean.xml"})
public class test {
    //private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Autowired
    private TestDao testDao;

    @Test
    public void test1() {
        testDao.test();
        //User user = userService.getUserById(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        //logger.info(JSON.toJSONString(user));
    }
}
