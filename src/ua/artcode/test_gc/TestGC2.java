package ua.artcode.test_gc;

/**
 * Created by serhii on 21.02.16.
 */
public class TestGC2 {

    public static void main(String[] args) {
        /*Object[] head = new Object[2];
        Object[] tail = head;*/
        Object[] tail = new Object[2];
        int count = 0;

        while(true){
            Object[] newNode = new Object[2];
            newNode[0] = new int[100_000];
            tail[1] = newNode;
            tail = newNode;
            System.out.println(++count);
        }

    }
}
