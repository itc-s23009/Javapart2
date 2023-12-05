package chapter11;

public class Main2 {
    public static void main(String[] args) {
        Greating g = (name) -> {
            return "hello, " + name;
        };
        String s = g.sayHello("MIKO");
        System.out.println(s);
    }
}
