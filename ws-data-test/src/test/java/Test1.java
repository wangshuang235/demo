import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by ShuangWang on 2017/7/26.
 */
public class Test1 {
    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario","Milan");
    Trader alan = new Trader("Alan","Cambridge");
    Trader brian = new Trader("Brian","Cambridge");
    List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );
    @Test
    public void test_1() {
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
    public void test_2() {
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<Integer> lengths = words.stream()
                                    .map(String::length)
                                    .collect(Collectors.toList());
        for (Integer s1 : lengths) {
            System.out.println(s1);
        }
        //() -> System.out.println("Hello Lambda Expressions");
        //Runnable runnable = () -> System.out.println("Hello Lambda Expressions");
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);*/
        /*String s = "weadsf,weasdfaf,faefae";
        String[] ss = s.split(",");
        for (String s1 : ss) {
            System.out.println(s1);
        }
        List<String> list = Arrays.asList("wwwwwwwww","sssssssssssss","hhhhhhhhh");*/

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

    /*




    */

    //(1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
    @Test
    public void test1() {
        List<Transaction> list =
                transactions.stream()
                        .filter(p -> p.getYear() == 2011)
                        .sorted(Comparator.comparing(Transaction::getValue))
                        .collect(Collectors.toList());
        System.out.print(list);
    }

    //(2) 交易员都在哪些不同的城市工作过？
    @Test
    public void test2() {
        List<String> cities =
                transactions.stream()
                        .map(n -> n.getTrader().getCity())
                        .distinct()
                        .collect(Collectors.toList());
        System.out.print(cities);
    }

    //(3) 查找所有来自于剑桥的交易员，并按姓名排序。
    @Test
    public void test3() {
        List<Trader> traders =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(f -> f.getCity() == "Cambridge")
                        .distinct()
                        .sorted(Comparator.comparing(Trader::getName))
                        .collect(Collectors.toList());
        System.out.print(traders);
    }

    //(4) 返回所有交易员的姓名字符串，按字母顺序排序。
    @Test
    public void test4() {
        String names = transactions.stream()
                .map(n -> n.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
                //.reduce("", (n1, n2) -> n1 + n2);

        System.out.print(names);
    }

    //(5) 有没有交易员是在米兰工作的？
    @Test
    public void test5() {
        Optional<Trader> any =
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(m -> m.getCity() == "Milan")
                .findAny();
        System.out.print(any.isPresent());
    }

    //(6) 打印生活在剑桥的交易员的所有交易额。
    @Test
    public void test6() {
        int sum = transactions.stream()
                .filter(f -> f.getTrader().getCity() == "Cambridge")
                .map(Transaction::getValue)
                .reduce(0, Integer::sum);
        System.out.print(sum);
    }

    //(7) 所有交易中，最高的交易额是多少？
    @Test
    public void test7() {
        int s = transactions.stream()
                .map(Transaction::getValue)
                .reduce(0, Integer::max);
        System.out.print(s);
    }

    //(8) 找到交易额最小的交易。
    @Test
    public void test8() {
        /*Optional s = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);*/
        Optional s = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        transactions.stream().min(Comparator.comparing(Transaction::getValue));

    }

    @Test
    public void testAdd() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.println(count);
        }
    }
    @Test
    public void testException() throws Exception {
        throw new Exception("dsfadfa");
    }
}