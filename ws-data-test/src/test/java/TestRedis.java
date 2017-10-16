import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by ShuangWang on 2017/9/27.
 */
public class TestRedis {
    @Test
    public void testJedis() {

        //1 设置ip地址和端口
        Jedis jedis = new Jedis("r-2ze8cfc1207df0b4.redis.rds.aliyuncs.com", 6379);

        //2 设置数据
        jedis.set("ws", "wangshuang");

        //3 获取数据
        String name = jedis.get("ws");

        //4 释放资源
        jedis.close();
    }

    @Test
    public void testbyte() {
        /*int a = 4;
        int b = a << 2;*/

        byte b = 12;
        short c = b;
        int d = c;
        double dou = d;
        long e = d;

        float f = 12.1255f;
        dou = f;
        char ch = 65;
        int cha = ch;
        f = d;
        String a = "\uffee";
        //byte \u005b \u005D xx;
        String nameAndphone = "wangshuang:17731838069";
        String [] na = nameAndphone.split(":");
        System.out.println(na.length);
    }
}
