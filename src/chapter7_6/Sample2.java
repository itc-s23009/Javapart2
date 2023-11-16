package chapter7_6;

import chapter6.Tax;

public class Sample2 {
    public static void main(String[] args) {
        Tax tax = new Tax(100, "田中弘", 30000, 10000);
        sub(tax);
        System.out.println(tax);
        Tax mytax = tax;

        mytax.setNumber(200);
        System.out.println(tax);
        System.out.println(mytax);
    }
    public static void sub(Tax mytax) {
        mytax.setNumber(4000);
    }
}
