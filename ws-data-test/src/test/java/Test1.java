import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by ShuangWang on 2017/7/26.
 */
public class Test1 {
    @Test
    public void test1() {
        Integer i = 0;
        if (i > 0 && i > 1 || i==0) {
            System.out.println("true");
        }else
        System.out.println("false");
        System.out.println("tdsafdafsdfe");
        Boolean b;
        Integer d;

    }

    @Test
    public void test2() {
        //() -> System.out.println("Hello Lambda Expressions");
        //Runnable runnable = () -> System.out.println("Hello Lambda Expressions");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);
            /*   String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

// 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }

// 使用 lambda 表达式以及函数操作(functional operation)
        //players.forEach((player) -> System.out.print(player + "; "));

// 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);
        */
    }
}
