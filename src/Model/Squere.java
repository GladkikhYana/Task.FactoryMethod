package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Squere extends Shape{
    public Squere(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Вы нарисовали квадрат с цветом: " + super.color;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.setLineWidth(2.0);
        gr.fillRect(60, 60, 150, 150);
        gr.strokeRect(60, 60, 150, 150);
    }
}
