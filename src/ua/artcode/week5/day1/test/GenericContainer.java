package ua.artcode.week5.day1.test;

/**
 * Created by master on 14.02.16.
 */
// declare Generic Type
public class GenericContainer<T> {

    // use generic type
    private T el;

    public GenericContainer(T el) {
        this.el = el;
    }

    public T getEl() {
        return el;
    }

    public void setEl(T el) {
        this.el = el;
    }

    private static void testGen(){
        //T t =
    }


    private void createProblem(){

    }
}
