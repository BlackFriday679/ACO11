package ua.artcode.algo.binary;

/**
 * Created by master on 13.02.16.
 */
public class Search {


    // 1 2 3 4 5 6 7 8 9  , 4 -> 3
    // 0 1 2 3 4 5 6 7 8
    // return -1 if no found, index in arr
    public static int binaryFind(int[] mas, int key){
        int start = 0;
        int end = mas.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(key < mas[mid]){
                end = mid - 1;
            } else if(key > mas[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int linearFind(int[] mas, int key){
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] == key){
                return i;
            }
        }
        return -1;
    }

}
