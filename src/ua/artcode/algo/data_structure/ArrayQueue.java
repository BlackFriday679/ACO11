package ua.artcode.algo.data_structure;

import java.util.Iterator;

/**
 * Created by master on 14.02.16.
 */
public class ArrayQueue<T> implements IQueue<T> {

    private T[] mas = (T[]) new Object[10];
    private int head;
    private int tail;
    private int size;

    public void enqueue(T obj) {
        if(size > mas.length){
            System.out.println("Error");
            return;
        }

        mas[tail++] = obj;
        size++;
    }


    public T dequeue() {
        if(size == 0){
            System.out.println("queue is empty");
            return null;
        }

        T ret = mas[head++];
        size--;
        return ret;
    }

    public Iterator<T> createIterator(){
        return iterator();
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayQueueIterator();
    }


    private class MyArrayQueueIterator implements Iterator<T> {

        int curr = head;

        @Override
        public boolean hasNext() {
            return curr < tail;
        }

        @Override
        public T next() {
            T ret = mas[curr++];
            return ret;
        }
    }

}
