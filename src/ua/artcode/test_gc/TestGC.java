package ua.artcode.test_gc;

/**
 * Created by serhii on 21.02.16.
 */
public class TestGC {

    public static void main(String[] args) {
        Container container = new Container();
        for (int i = 0; i < container.mas.length; i++) {
            container.mas[i] = "Serhii" + Math.random();
        }

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        container = null;

        System.gc();



        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Container {

    Object[] mas = new Object[1000];

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object going to be destroyed");
    }
}
