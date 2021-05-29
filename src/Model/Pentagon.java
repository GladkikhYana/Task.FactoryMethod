package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Pentagon extends Shape{
    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public String toString() {
      return "Вы нарисовали пятиугольник с цветом: " + super.color;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.setLineWidth(2.0);
        gr.fillPolygon(
                new double[]{90, 190, 10, 10, 10}, // X координаты вершин
                new double[]{30, 170, 170, 10, 10}, // Y координаты вершин
                5);
    }
}
