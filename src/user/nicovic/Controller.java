package user.nicovic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

import static user.nicovic.Main.stage;

public class Controller {



    @FXML
    public void startKnap(ActionEvent button) throws IOException {
        Parent newRoot = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage.getScene().setRoot(newRoot);
    }
}
