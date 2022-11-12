package lesson9;

public class Circle extends Shape implements Addable{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquareOfShape() {
        return Math.floor(radius * Math.pow(Math.PI, 2));
    }

    @Override
    public double getPerimeterOfShape() {
        return Math.floor(2 * radius * Math.PI);
    }

    @Override
    public double addNumber(int number) {
        return getPerimeterOfShape() + number;
    }
}
