package test;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by ShuangWang on 2017/7/14.
 */
public class TestBigDecimal {
    @Test
    public void test() {
        BigDecimal big = new BigDecimal(10);
        BigDecimal little = new BigDecimal(5);
        System.out.print(big.compareTo(little));
    }
    @Test
    public void test1() {
        BigDecimal big = new BigDecimal(433);
        BigDecimal little = new BigDecimal(100);
        BigDecimal bigDecimal = big.divide(little).setScale(0, BigDecimal.ROUND_DOWN);
        System.out.print(bigDecimal);
    }
    @Test
    public void test2() {
        Calendar calendar = Calendar.getInstance();
        //System.out.print(calendar);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
    }

}
