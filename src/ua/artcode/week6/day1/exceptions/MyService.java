package ua.artcode.week6.day1.exceptions;

import ua.artcode.design_patterns.proxy.IService;
import ua.artcode.design_patterns.proxy.ServiceFactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by master on 20.02.16.
 */
public class MyService {

    private static final IService SERVICE = ServiceFactory.create();

    public static String login(String name, String pass) throws InvalidCredentialException, ServiceDosentWorkException {

        Calendar calendar = new GregorianCalendar();
        if(calendar.get(Calendar.DAY_OF_WEEK) < 6){
            throw new ServiceDosentWorkException("use service in weekdays only");
        }

        if("admin".equals(name) && "1234".equals(pass)){
            return String.valueOf(genRandomKey());
        } else {

            throw new InvalidCredentialException("wrong pass or login");
        }
    }

    private static int genRandomKey() {
        return (int)(System.currentTimeMillis() * Math.random());
    }


}
