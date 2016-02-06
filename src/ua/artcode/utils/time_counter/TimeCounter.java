package ua.artcode.utils.time_counter;

/**
 * StrategyPattern
 */
public class TimeCounter {

    private ITimeAction timeAction;

    public TimeCounter(ITimeAction timeAction) {
        this.timeAction = timeAction;
    }

    public void setTimeAction(ITimeAction timeAction) {
        this.timeAction = timeAction;
    }

    public String countActionTime(){
        long start = System.nanoTime();
        timeAction.callAction();
        long end = System.nanoTime();
        return "nanos " + (end - start);
    }



}
