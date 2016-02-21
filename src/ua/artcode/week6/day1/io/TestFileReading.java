package ua.artcode.week6.day1.io;

import java.io.FileNotFoundException;

/**
 * Created by serhii on 21.02.16.
 */
public class TestFileReading {

    public static void main(String[] args) throws FileNotFoundException {
        String res =
                IOUtils.readFileContent("/home/serhii/dev/IdeaProjects/ACO11/home/week2.txt");


        System.out.println(res);
    }
}
