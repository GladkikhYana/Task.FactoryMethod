package Model;

import javafx.scene.canvas.GraphicsContext;
import java.awt.*;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;

public class Angle extends Shape {


    @Override
    public String toString() {
        return "Вы нарисовали угол с цветом: " + super.color;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(color);
        gr.setLineWidth(10);
        gr.strokePolygon(new double[]{25, 250},
                new double[]{25,25},2
        );
        gr.strokePolygon(new double[]{30, 30},
                new double[]{25,250},2
        );
    }
    public Angle (Color color)
    {
        super(color);
    }
}

