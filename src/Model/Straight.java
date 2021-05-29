package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Straight extends Shape{
    public Straight(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Вы нарисовали прямую с цветом: " + super.color;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setLineWidth(10.0);
        gr.setStroke(color);
        gr.strokeLine(50, 100, 240, 100);
    }
}
