import cn.ws.mybatis.dao.TestDao;
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
    @Autowired
    private TestDao testDao;
    @Test
    public void test1() {
        testDao.test();
    }
}
