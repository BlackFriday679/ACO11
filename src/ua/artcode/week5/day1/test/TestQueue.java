package ua.artcode.week5.day1.test;

import ua.artcode.algo.data_structure.ArrayQueue;
import ua.artcode.algo.data_structure.IQueue;

import java.util.Iterator;

/**
 * Created by master on 14.02.16.
 */
public class TestQueue {


    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();


        queue.enqueue("1231");
        queue.enqueue(34);
        queue.enqueue(new Double(34.34));

        String el1 = (String) queue.dequeue();
        Integer el2 = (Integer) queue.dequeue();
        Double el3 = (Double) queue.dequeue();


        // nested
        /*ArrayQueue.MyArrayQueueIterator iterator =
                new ArrayQueue.MyArrayQueueIterator();*/

        //new ArrayQueue().new MyArrayQueueIterator();

        Iterator iterator = queue.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
