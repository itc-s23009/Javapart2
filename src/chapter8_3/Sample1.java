package chapter8_3;

import java.time.LocalDate;

public class Sample1 {
    public static void main(String[] args) {
        var expDate = LocalDate.of(2026, 3, 31);
        var student = new StudentMember(100, "田中拡", expDate);

        System.out.println("id=" + student.getId());
        System.out.println("name=" +student.getName());
        System.out.println(("会費=" + student.membershipFee()));
        System.out.println("期限切れ=" + student.isExpired());
        System.out.println("有効期限=" + student.getExpDate());
    }
}
