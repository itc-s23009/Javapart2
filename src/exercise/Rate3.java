package exercise;

import chapter10_2.RateIntf;

public class Rate3 implements RateIntf {
    @Override
    public double taxRate(int gaku) {
        return gaku < 160 ? 0.001875 * gaku : 0.3;
    }
}
