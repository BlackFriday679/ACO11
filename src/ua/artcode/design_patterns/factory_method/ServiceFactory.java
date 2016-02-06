package ua.artcode.design_patterns.factory_method;

/**
 * Created by serhii on 06.02.16.
 */
public class ServiceFactory {

    public static Service create(){
        return new Service(new VkApi(new Host("Service")));
    }


}
