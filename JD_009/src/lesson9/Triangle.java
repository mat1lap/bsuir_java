package lesson9;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    private boolean isTriangleReal(){
        return (side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side2 + side1);
    }

    @Override
    public double getSquareOfShape() {
        if (isTriangleReal()){
            double p = (side1 + side2 + side3) / 2;
            return Math.floor(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
        } else {
            return 0;
        }
    }

    @Override
    public double getPerimeterOfShape() {
        if (isTriangleReal()) {
            return Math.floor(side1 + side2 + side3);
        } else {
            return 0;
        }
    }
}
