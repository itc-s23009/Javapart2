package chapter9_1;

public abstract class Menber {
    private long id;
    private String name;

    public Menber(long id, String name) {
        this.id = id;
        this.name = name;
    }
    protected abstract int fee(); //抽象メソッド
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
