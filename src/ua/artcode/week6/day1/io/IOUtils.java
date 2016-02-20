package ua.artcode.week6.day1.io;

import java.io.*;

/**
 * Created by master on 20.02.16.
 */
public class IOUtils {

    public static byte[] getBytes(String path) throws FileNotFoundException {
        InputStream is = new FileInputStream(path);
        StringBuilder res = new StringBuilder();

        int val = -1;
        try{
            while((val = is.read()) != -1){
                res.append(val);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return res.toString().getBytes();
    }

    public static byte[] getBytesWithBuff(String path) throws FileNotFoundException {
        InputStream is = new FileInputStream(path);

        byte[] buff = new byte[1024];

        StringBuilder res = new StringBuilder();

        int count = -1;
        try{
            while((count = is.read(buff)) != -1){
                res.append(buff);// todo find problem, see string result before returning
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return res.toString().getBytes();
    }


    public static void writeInto(byte[] in, String path) throws FileNotFoundException {
        OutputStream os = new FileOutputStream(path);
        try {
            os.write(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
