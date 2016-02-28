package ua.artcode.week7.day2;

import java.util.*;

/**
 * Created by serhii on 28.02.16.
 */
public class TestMap {


    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();


        map.put(1, "Ivan");
        String nullVal = map.put(2,"Petro");
        String old = map.put(2,"Rick");

        map.put(44, "Jack");
        map.put(33, "Evan");
        map.put(22, "Yura");
        map.put(67, "Serhii");
        map.put(14, "Vlad");
        map.put(88, "Oles");


        map.isEmpty();
        boolean containsKey = map.containsKey(3);
        boolean containsValue = map.containsValue("Ivan");

        String odlValue = map.remove(2);
        map.replace(4, "Rick");

        System.out.println(map.size());
        String name = map.get(1);




        // how to iterate
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.printf("key %s, value %s\n", key, map.get(key));
        }

        System.out.println();

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println();
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.printf("key %s, value %s\n", entry.getKey(), entry.getValue());
        }

    }
}
