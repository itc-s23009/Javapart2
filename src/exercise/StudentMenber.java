package exercise;

import java.time.LocalDate;

public class StudentMenber extends Menber{
    private LocalDate expDate;

    public StudentMenber(long id, String name, LocalDate expDate) {
        super(id, name);
        this.expDate = expDate;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    @Override
    public int fee() {
        return 500;
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(expDate);
    }
}
