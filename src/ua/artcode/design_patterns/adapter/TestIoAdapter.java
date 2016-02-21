package ua.artcode.design_patterns.adapter;

import java.io.*;

/**
 * Created by serhii on 21.02.16.
 */
public class TestIoAdapter {


    public static final String PATH = "/home/serhii/dev/IdeaProjects/ACO11/src/ua/artcode/design_patterns/adapter/Militioner.java";

    public static void main(String[] args) throws FileNotFoundException {
        byte[] mas = new byte[12200];

        ByteArrayInputStream bais =
                new ByteArrayInputStream(mas);


        File file = new File(PATH);
        InputStream is = new FileInputStream(file);

    }
}
