package ua.artcode.week5.day1.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by master on 14.02.16.
 */
public class TestStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34,23,12,66,44,34,23,678,2323,345,23,12,11,33,45,44);
        list.stream()
                .distinct()
                .filter((x) -> x % 2 == 0)
                .sorted()
                .map((el) -> String.valueOf(el))
                .limit(5).forEach(System.out::println);
    }


}
