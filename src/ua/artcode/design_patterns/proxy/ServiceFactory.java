package ua.artcode.design_patterns.proxy;

/**
 * Created by serhii on 06.02.16.
 */
public class ServiceFactory {

    public static IService create(){
        return new ServiceProxy(new Service(new VkApi(new Host("Service"))));
    }


}
