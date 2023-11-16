package chapter7_6;

public class Joining {
    private String str;
    private String delimiter;

    public Joining(String str, String delimiter) {
        this.str = str;
        this.delimiter = delimiter;
    }

    public String add(String s) {
        str += str.isEmpty() ? s : delimiter + s;
        return str;
    }

    public String getStr() {
        return str;
    }

    public static void main(String[] args) {
        Joining j = new Joining("",",");

        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getStr());
    }
}
