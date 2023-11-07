package chapter6;

public class Sample1 {
    public static void main(String[] args) {
        Tax tax = new Tax(100, "田中拡", 300_000, 100_000);
        System.out.println(tax.zeigaku());
    }
}
