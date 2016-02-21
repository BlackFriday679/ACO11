package ua.artcode.week6.day1.serialization;

import ua.artcode.university.model.common.Address;
import ua.artcode.university.model.common.Contact;
import ua.artcode.university.model.common.MyDate;
import ua.artcode.university.model.role.Student;
import ua.artcode.week6.day1.io.IOUtils;

/**
 * Created by serhii on 21.02.16.
 */
public class TestSerializaton {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Oleg", new MyDate(1987, 6, 13),
                        new Address("UA", "Kiev", "peremogy sqr", 34),
                        new Contact("+343434334", null)),
                new Student("Andrey", new MyDate(1990, 12, 22),
                        new Address("UA", "Odessa", "derebasovskaya st", 2), new Contact("+34300000", null)),
                new Student("Serhii", new MyDate(1970, 4, 23),
                        new Address("UA", "Odessa", "derebasovskaya st", 2),
                        new Contact("+34300000", null))};

        Student st = students[0];
        IOUtils.saveObj(st, "temp/serial.out");


        Student obj = IOUtils.loadObj("temp/serial.out");

    }
}
