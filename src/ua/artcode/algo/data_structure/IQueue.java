package ua.artcode.algo.data_structure;

/**
 * Created by master on 14.02.16.
 */
public interface IQueue<E> extends Iterable<E> {

    void enqueue(E obj);

    E dequeue();

}
