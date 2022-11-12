package lesson9;

public class Rectangle extends Shape implements Addable{
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getSquareOfShape() {
        return Math.floor(width * length);
    }

    @Override
    public double getPerimeterOfShape() {
        return Math.floor(2*(width + length));
    }

    @Override
    public double addNumber(int number) {
        return getPerimeterOfShape() + 2 * number;
    }
}
