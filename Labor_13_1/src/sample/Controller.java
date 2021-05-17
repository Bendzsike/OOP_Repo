package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import sample.model.Counter;

public class Controller {
    Counter counter = new Counter();
    private String buttonLabel = "Foo";


    public void closeApp(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void onMouseEnter(MouseEvent mouseEvent) {
        Button button = (Button) mouseEvent.getSource();
        buttonLabel = button.getText();
        button.setText("Mouse entered!");
    }

    public void onMouseExited(MouseEvent mouseEvent) {
        Button button = (Button) mouseEvent.getSource();
        button.setText(buttonLabel);
    }

    public void refresh(ActionEvent actionEvent) {
        counter.inc();
        String label = "Pressed: " + counter.getValue();
        Button button = (Button)actionEvent.getSource();
        button.setText(label);
    }
}
