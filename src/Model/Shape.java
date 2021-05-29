package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    Color color;
    public abstract String toString();
    abstract public void draw(GraphicsContext gr);
    public Shape(Color color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}