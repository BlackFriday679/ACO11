package ua.artcode.design_patterns.factory_method;

/**
 * Created by serhii on 06.02.16.
 */
public class TestFactoryMethod {


    public static void main(String[] args) {
        Service service = ServiceFactory.create();
        service.login("Serhii", "234234");
    }
}


