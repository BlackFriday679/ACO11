package ua.artcode.utils;

import java.util.Arrays;

/**
 * Created by serhii on 16.01.16.
 */
public class ArrayUtils {

    // int[] -> String
    public static String toString(int[] mas){
        String temp = "";

        // fori + Tab
        for (int i = 0; i < mas.length; i++) {
            temp += mas[i] + " ";
        }

        return temp;
    }


    public static int[] genRanMas(int size, int range){
        int[] mas = new int[size];
        for (int i = 0; i < size; i++) {
            mas[i] = (int)(Math.random() * range);
        }

        return mas;

    }

    public static void print(int[] mas){
        System.out.println(toString(mas));
    }

    // null
    public static int min(int[] mas){
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if(mas[i] < min){
                min = mas[i];
            }
        }
        return min;
    }

    // binaryFind index of first el
    public static int indexOf(int[] target, int el){

        if(target == null){
            System.out.println("!!!!!array is null!!!!!");
            return -1;
        }

        for (int i = 0; i < target.length; i++) {
            if(target[i] == el) {
                return i;
            }
        }

        return -1;
    }

    public static int lastIndexOf(int[] target, int el){
        for (int i = target.length - 1; i >= 0; i--) {
            if(target[i] == el) {
                return i;
            }
        }
        return -1;
    }

    // {1,2,3,4}, [1,2) - 2
    public static int[] subarray(int[] mas, int start, int end){
        int[] res = new int[end - start];

        for (int i = 0; i < res.length; i++, start++) {
            res[i] = mas[start];
        }

        return res;
    }

    public static int[] revert(int[] mas){

        // 1,2,3,4,5 -> 5,4,3,2,1
        for (int i = 0; i < mas.length / 2; i++) {
            int temp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = temp;
        }

        return mas;
    }

    public static int[] sym(int[] a, int[] b){
        // condition ? sta1 : sta2
        int size = a.length > b.length ? a.length : b.length;
        int[] res = new int[size];

        for (int i = 0; i < size; i++) {

            if(i < a.length){
                res[i] += a[i];
            }

            if(i < b.length){
                res[i] += b[i];
            }

        }

        return res;
    }

    // 1 2 3 4 * 3 = 3 + 6 + 9 + 12 =  30
    public static int multAndSum(int[] a, int operand){

        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res = res + a[i] * operand;
        }

        return res;
    }

    public static void sortQuick(int[] mas){
        Arrays.sort(mas); // quick
    }


    public static void selectionSort(int[] mas){
        for (int i = 0; i < mas.length; i++) {

            int minI = i;
            //binaryFind min
            for (int j = i + 1; j < mas.length; j++) {
                if(mas[minI] > mas[j]){
                    minI = j;
                }
            }

            //swap
            int temp = mas[i];
            mas[i] = mas[minI];
            mas[minI] = temp;

        }
    }






}
