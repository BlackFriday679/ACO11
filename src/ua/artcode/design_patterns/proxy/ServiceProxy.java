package ua.artcode.design_patterns.proxy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by serhii on 06.02.16.
 */
public class ServiceProxy implements IService {

    private IService target;
    private List<String> history = new ArrayList<>();

    public ServiceProxy(IService target) {
        this.target = target;
    }

    @Override
    public String login(String name, String pass) {
        history.add(String.format("date %1$ty-%1$tm-%1$td, login %2$s, pass %3$s",
                new Date(),name,pass));

        return target.login(name,pass);
    }
}
