package ua.artcode.design_patterns.proxy;

/**
 * Created by serhii on 06.02.16.
 */
public class TestFactoryMethod {


    public static void main(String[] args) {
        IService service = ServiceFactory.create();
        service.login("Serhii", "234234");
    }
}


