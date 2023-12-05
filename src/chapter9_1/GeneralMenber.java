package chapter9_1;

public abstract class GeneralMenber extends Menber{
    public GeneralMenber(long id, String name) {
        super(id, name);
    }

    @Override
    protected int fee() {
        return 1000;
    }
}
