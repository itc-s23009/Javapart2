package exercise;

import chapter6.Tax;

public class E621_1 {
    public static void main(String[] args) {
        Tax itirou = new Tax(110, "木村一郎", 300000, 90000);
        Tax kouzi = new Tax(120, "鈴木浩二", 250000, 120000);
        Tax wataru = new Tax(130,"斎藤渉", 400000, 180000);

        System.out.println(itirou.zeigaku());
        System.out.println(kouzi.zeigaku());
        System.out.println(wataru.zeigaku());
    }
}
