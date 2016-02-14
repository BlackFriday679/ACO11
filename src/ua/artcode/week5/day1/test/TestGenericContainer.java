package ua.artcode.week5.day1.test;

/**
 * Created by master on 14.02.16.
 */
public class TestGenericContainer {

    public static void main(String[] args) {
        // define generic type <>
        GenericContainer<String> container = new GenericContainer<String>("53");
        container.setEl("2342");

        String el = container.getEl();
    }
}
