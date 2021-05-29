package Model;

import javafx.scene.paint.Color;

public class ShapeFactory {
    public Shape createShape(int numberOfSides) {
        switch (numberOfSides)
        {
            case 0:
                return new Circle(Color.GREEN);
            case 1:
                return new Straight(Color.AQUAMARINE);
            case 2:
                return new Angle(Color.BLUE);
            case 3:
                return new Triangle(Color.RED);
            case 4:
                return new Squere(Color.AQUA);
            case 5:
                return new Pentagon(Color.GRAY);
            default:
                return null;
        }
    }
}

