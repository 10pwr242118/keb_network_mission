package network.mission0213;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Shape {
    private String type, color;
    private Double area;

    public Shape(String ptype, String pcolor, Double parea) {
        this.type = ptype;
        this.color = pcolor;
        this.area = parea;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s (%s, %f)", type, color, area);
    }

    static List<Shape> shapes = Arrays.asList(
            new Shape("triangle", "red", 10.5),
            new Shape("rectangle", "blue", 11.2),
            new Shape("circle", "blue", 16.5),
            new Shape("circle", "red", 5.3),
            new Shape("circle", "yellow", 8.1),
            new Shape("rectangle", "blue", 20.7),
            new Shape("triangle", "blue", 3.4),
            new Shape("rectangle", "red", 12.6));
}

public class missionTwo {
    public static void main(String[] args) {
        List<Shape> rectangles = findShapes(Shape.shapes, "rectangle", null, null);
        System.out.print("Rectangle: ");
        System.out.println(rectangles);
        List<Shape> redNSmallShapes = findShapes(Shape.shapes, null, "red", 12.0);
        System.out.print("red(area<=12.0): ");
        System.out.println(redNSmallShapes);
    }

    static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area) {
        List<Shape> result = new ArrayList<>();

        for (Shape s : shapes) {
            if (type != null) {
                if (s.getType().equals(type)) {
                    result.add(s);
            } else {
                if (s.getColor().equals(color) && s.getArea() <= area)
                    result.add(s);
            }
        }
        return result;
    }
}
