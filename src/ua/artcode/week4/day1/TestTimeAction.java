package ua.artcode.week4.day1;

import ua.artcode.utils.ArrayUtils;
import ua.artcode.utils.time_counter.ITimeAction;
import ua.artcode.utils.time_counter.TimeCounter;

import java.util.Arrays;

/**
 * Created by serhii on 06.02.16.
 */
public class TestTimeAction {


    public static void main(String[] args) {
        int[] mas = ArrayUtils.genRanMas(1_00000, 100_000);
        int[] copy = Arrays.copyOf(mas, mas.length);


        TimeCounter timeCounter = new TimeCounter(new QuickSortAction(mas));
        String res1 = timeCounter.countActionTime();
        System.out.println(res1);

        timeCounter.setTimeAction(new SelectionSortAction(copy));
        String res2 = timeCounter.countActionTime();
        System.out.println(res2);

    }
}

class QuickSortAction implements ITimeAction {

    private int[] mas;

    public QuickSortAction(int[] mas) {
        this.mas = mas;
    }

    @Override
    public void callAction() {
        Arrays.sort(mas);
    }
}


class SelectionSortAction implements ITimeAction {

    private int[] mas;

    public SelectionSortAction(int[] mas) {
        this.mas = mas;
    }

    @Override
    public void callAction() {
        ArrayUtils.selectionSort(mas);
    }
}
