package ua.artcode.week5.day1.test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by master on 14.02.16.
 */
public class GenMethodContainer {


    public static void main(String[] args) {

        Double dob = test1(2.4);
        String str = test1("sdfs");

        String res = GenMethodContainer.<String>test1("sdf");
        Integer res2 = GenMethodContainer.<String,Integer>test3("sdf");
        Object obj = test3(34);

        test2(23,"");

        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        Comparator<Integer> comparator1 = (Integer o1,Integer o2) -> {return o1 - o2;};
        Comparator<Integer> comparator2 = (o1, o2) -> o1 - o2;



        GenMethodContainer.<Integer>compare(23,43, comparator2);
        compare(23,43, comparator2);

        compare("23",44);

    }

    public static<E> int compare(E obj1, E obj2, Comparator<E> comparator){
        return comparator.compare(obj1,obj2);
    }

    public static<E extends Comparable> int compare(E obj1, E obj2){
        return obj1.compareTo(obj2);
    }

    public static<T> T test1(T t){
        return t;
    }

    public static<T,E> T test2(T t, E e){
        return t;
    }

    public static<T,V> V test3(T t){
        return null;
    }

}
