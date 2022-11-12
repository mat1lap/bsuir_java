package lesson9;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("rectangle1", 15, 12.5);
        Rectangle rectangle2 = new Rectangle("rectangle2", 4, 27);

        Triangle triangle1 = new Triangle("triangle1", 34, 81, 59);
        Triangle triangle2 = new Triangle("triangle2", 5, 7, 23);

        Circle circle1 = new Circle("circle1", 23);
        Circle circle2 = new Circle("circle2", 6);

        Shape[] shapes = {rectangle1, rectangle2, triangle1, triangle2, circle1, circle2};
        ShapeService shapeService = new ShapeService();
        shapeService.displayInformation(shapeService.createMapOfShapeSquares(shapes));
    }
}