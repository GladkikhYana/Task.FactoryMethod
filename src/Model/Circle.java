package Model;

import javafx.scene.canvas.GraphicsContext;
import java.awt.*;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import java.awt.*;

public class Circle extends Shape {


    @Override
    public String toString() {
        return "Вы нарисовали круг с цветом: " + super.color;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillOval(25, 25, 225, 225);
    }
    public Circle (Color color)
    {
        super(color);
    }
}