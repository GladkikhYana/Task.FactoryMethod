package sample;

import Model.ShapeFactory;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.regex.*;
import java.awt.*;

public class Controller {
    public TextField value1;
    public Canvas can;
    public ColorPicker picker;
    public Label figura;

    public void addPicker(ActionEvent actionEvent) {
        GraphicsContext gr = can.getGraphicsContext2D();
        //if (checkWithRegExp(value1.getText()) == false || value1.getText().equals(""))
        //{
        //  Alert alert = new Alert(Alert.AlertType.INFORMATION);
        //  alert.setTitle("Предупреждение: ");
        //  alert.setHeaderText(null);
        //  alert.setContentText("Введено нечисло или число не из диапазона от 0 до 5!");
        //  alert.showAndWait();
        //  return;
        //}
        //else {
            int numberOfSides = Integer.parseInt(value1.getText());
            ShapeFactory shapeFactory = new ShapeFactory();
            Model.Shape sh;
            sh = shapeFactory.createShape(numberOfSides);
            gr.clearRect(0, 0, 250, 485);
            sh.setColor(picker.getValue());
            sh.draw(gr);
            figura.setText(""+sh.toString());
        //}
    }
}
