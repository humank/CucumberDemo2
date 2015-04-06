package solid.humank.checkoutDemo2.impl;

/**
 * Created by yikai on 2015/3/28.
 */
public class Checkout {
    private int runningTotal;
    public void add(int count, int price) {
        runningTotal+= (count * price);
    }

    public int total() {
        return runningTotal;
    }
}
