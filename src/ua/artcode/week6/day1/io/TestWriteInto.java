package ua.artcode.week6.day1.io;

import java.util.Arrays;


public class TestWriteInto {

    public static final String ABSOLUTE_TEMP_PATH = "/home/serhii/dev/IdeaProjects/ACO11/temp/";
    public static final String RELATIVE_TEMP_PATH = "temp";

    public static void main(String[] args) {
        IOUtils.writeIntoFile(Arrays.asList("line1\n","line2\n","line3\n"), RELATIVE_TEMP_PATH + "/out.txt");
    }
}
