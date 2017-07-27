package ws.test.entities;

/**
 * Created by ShuangWang on 2017/7/26.
 */
public class Hello {
    private String say(String name, int age) {
        return "hello" + name + ",age:" + age;
    }
    public String test(String name, int age) {
        return "public" + name + ",age:" + age;
    }
}
