package exercise;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double menseki() {
        double s = (side1 + side2 + side3) / 2;
        return  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public  boolean isTriangle() {
        return side2 + side3 > side1 && side1 > Math.abs(side2 - side3);
    }
}
