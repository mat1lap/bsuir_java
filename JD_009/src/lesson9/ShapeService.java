package lesson9;

import java.util.HashMap;

public class ShapeService {
    public HashMap<String, Double> createMapOfShapePerimeters (Shape[] shapes) {
        HashMap<String, Double> shapePerimeters = new HashMap<>();
        for (Shape shape : shapes) {
            shapePerimeters.put(shape.getName(), shape.getPerimeterOfShape());
        }
        return shapePerimeters;
    }

    public HashMap<String, Double> createMapOfShapeSquares (Shape[] shapes) {
        HashMap<String, Double> shapeSquares = new HashMap<>();
        for (Shape shape : shapes) {
            shapeSquares.put(shape.getName(), shape.getSquareOfShape());
        }
        return shapeSquares;
    }

    public void displayInformation (HashMap<String, Double> shapeInformation) {
        for (String key : shapeInformation.keySet()) {
            System.out.println(key + " - " + shapeInformation.get(key));
        }
    }
}