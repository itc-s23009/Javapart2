package exercise;

import java.time.LocalDate;

public class ESeniorMenber extends Menber{
    private LocalDate birthdey;

    public ESeniorMenber(long id, String name, LocalDate birthdey) {
        super(id, name);
        this.birthdey = birthdey;
    }

    public LocalDate getBirthdey() {
        return birthdey;
    }

    public void setBirthdey(LocalDate birthdey) {
        this.birthdey = birthdey;
    }

    @Override
    public int fee() {
        return 700;
    }
}
