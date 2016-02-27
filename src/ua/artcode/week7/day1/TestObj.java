package ua.artcode.week7.day1;

/**
 * Created by serhii on 27.02.16.
 */
public class TestObj {

    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestObj testObj = (TestObj) o;

        return Double.compare(testObj.price, price) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(price);
        return (int) (temp ^ (temp >>> 32));
    }
}
