package exercise;

public class E631_1 {
    public static void main(String[] args) {
        Triangle t = new Triangle(2.5, 3.0, 5.1);
        System.out.printf("面積=%.2f%n",t.menseki());
        System.out.printf(
                "(abc)=(%.1f, %.1f, %.1f)%n",
                t.getSide1(), t.getSide2(), t.getSide3());

        Triangle t2 = new Triangle(1.0, 2.0, 3.0);
        System.out.printf("三角形作れる?=%b%n", t2.isTriangle());
        System.out.printf("面積=%.2f%n", t2.menseki());
        System.out.printf(
                "(a,b,c)=(%.1f, %.1f, %.1f)%n",
                t2.getSide1(), t2.getSide2(), t2.getSide3());
    }
}
