import org.junit.Test;
import ws.test.entities.Hello;
import java.lang.reflect.Method;

/**
 * Created by ShuangWang on 2017/7/26.
 */
public class TestReflect {
    @Test
    public void test1() throws Exception{
        Object hello = Class.forName(Hello.class.getName()).newInstance();

        Method method = hello.getClass().getMethod("say", String.class, int.class);
        method.setAccessible(true);
        Object i = method.invoke(hello, "ws", 21);
        System.out.print(i.toString());
    }
}
