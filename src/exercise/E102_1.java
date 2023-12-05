package exercise;

import chapter10_2.Rate2;
import chapter10_2.Tax;

public class E102_1 {
    public static void main(String[] args) {
        Tax tax = new Tax(100, "田中拡", 150);
        int zei = tax.zeigaku(new Rate3());
        System.out.println(tax.getName() + "\t" + zei);
    }
}
