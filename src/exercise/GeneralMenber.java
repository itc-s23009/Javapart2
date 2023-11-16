package exercise;

public class GeneralMenber extends Menber {

    public GeneralMenber(long id, String name) {
        super(id, name);
    }

    @Override
    public int fee() {
        return 1000;
    }
}
