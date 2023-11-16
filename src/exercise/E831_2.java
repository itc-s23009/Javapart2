package exercise;

import java.time.LocalDate;
import java.util.List;

public class E831_2 {
    public static void main(String[] args) {
        List<Menber> list = List.of(
                new GeneralMenber(200,"木村一郎"),
                new StudentMenber(100, "田中浩二", LocalDate.of(2025, 3, 31)),
                new ESeniorMenber(150, "鈴木次郎", LocalDate.of(1960, 3,31))
        );
        int total = 0;
        for (Menber m : list) {
            total += m.fee();
        }
        System.out.println("合計=" + total);
    }
}
