package chapter9_1;

import java.time.LocalDate;

public abstract class StudentMenber extends Menber{
    private LocalDate expDate;

    public StudentMenber(long id, String name, LocalDate expDate) {
        super(id, name);
        this.expDate = expDate;
    }

    @Override
    protected int fee() {
        return isExpired() ? 1000 : 700;
    }
    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        return today.isAfter(expDate);
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
