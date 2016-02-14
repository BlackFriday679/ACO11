package ua.artcode.algo.binary;

import ua.artcode.utils.ArrayUtils;
import ua.artcode.utils.time_counter.ITimeAction;
import ua.artcode.utils.time_counter.TimeCounter;

import java.util.Arrays;

public class TestBinarySearch {

    public static void main(String[] args) {

        final int[] mas = new int[200_000_000];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
        }

        //Arrays.sort(mas);

        final int target = mas[mas.length - 2];
        //target = 34;

        // anonymous(no name) class -> declare class and create object
        ITimeAction action1 = new ITimeAction(){
            @Override
            public void callAction() {
                int indexBin = Search.binaryFind(mas,target);
            }
        };

        TimeCounter tc = new TimeCounter(action1);
        System.out.println(tc.countActionTime());

        tc.setTimeAction(new ITimeAction() {
            @Override
            public void callAction() {
                int indexLin = Search.linearFind(mas,target);
            }
        });

        System.out.println(tc.countActionTime());



    }

}
