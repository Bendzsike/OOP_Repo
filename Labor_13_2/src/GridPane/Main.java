package GridPane;

import GridPane.model.Student;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
    Student student = new Student();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Text text1 = new Text("First Name");

        Text text2 = new Text("Last Name");

        Text text3 = new Text("Email");

        TextField textField1 = new TextField();

        TextField textField2 = new TextField();

        TextField textField3 = new TextField();

        Button button1 = new Button("Submit");
        Button button2 = new Button("Clear");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(400, 200);

        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(text3, 0, 2);
        gridPane.add(textField3, 1, 2);
        gridPane.add(button1, 0, 3);
        gridPane.add(button2, 1, 3);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                student.setFirstName(textField1.getText());
                student.setLastName(textField2.getText());
                student.setEmail(textField3.getText());
                student.save();
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                textField1.clear();
                textField2.clear();
                textField3.clear();
            }
        });

        Scene scene = new Scene(gridPane);

        Stage stage = new Stage();
        stage.setTitle("Grid Pane Example");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
