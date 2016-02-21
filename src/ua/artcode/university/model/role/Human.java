package ua.artcode.university.model.role;

import ua.artcode.university.model.common.Address;
import ua.artcode.university.model.common.Contact;
import ua.artcode.university.model.common.MyDate;

import java.io.Serializable;

/**
 * Created by serhii on 30.01.16.
 */
public class Human implements Serializable {


    private String name;
    private int age;

    private MyDate birthday;
    private Address address;
    private Contact contact;

    public Human() {
    }

    public Human(String name, int age, MyDate birthday, Address address, Contact contact) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
