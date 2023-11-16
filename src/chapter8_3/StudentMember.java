package chapter8_3;

import chapter8_1.GeneralMember;

import java.time.LocalDate;

public class StudentMember extends GeneralMember { // extends GeneralMember サブクラス
    public LocalDate expDate;


    public StudentMember(long id, String name, LocalDate expDate) {
        super(id, name); // GerneralMember.java の継承
        this.expDate =expDate;
    }

    @Override
    public int membershipFee() { // 会費
        return 500;
    }

    public  boolean isExpired() { //期限日
        LocalDate today = LocalDate.now();
        return  today.isAfter(expDate);
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
