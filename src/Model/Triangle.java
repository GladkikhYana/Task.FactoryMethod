package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Вы нарисовали треугольник с цветом: " + super.color;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.setLineWidth(2.0);
        gr.fillPolygon(
                new double[]{90, 190, 10}, // X координаты вершин
                new double[]{30, 170, 170}, // Y координаты вершин
                3);
    }
}
