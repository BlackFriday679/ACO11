package ua.artcode.week5.day1.test;

import ua.artcode.algo.data_structure.ArrayQueue;
import ua.artcode.algo.data_structure.IQueue;

import java.util.Iterator;

/**
 * Created by master on 14.02.16.
 */
public class TestGenericQueue {


    public static void main(String[] args) {
        IQueue<Integer> queue = new ArrayQueue<Integer>();


        queue.enqueue(33);
        queue.enqueue(34);
        queue.enqueue(22);


        // nested
        /*ArrayQueue.MyArrayQueueIterator iterator =
                new ArrayQueue.MyArrayQueueIterator();*/

        //new ArrayQueue().new MyArrayQueueIterator();

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Integer curr : queue){
            System.out.println(curr);
        }

    }
}
