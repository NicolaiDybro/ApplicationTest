package user.nicovic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import user.nicovic.Objects.Bruger;

public class Main extends Application {

    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent start = FXMLLoader.load(getClass().getResource("start.fxml"));

        primaryStage.setTitle("hej");
        primaryStage.setScene(new Scene(start, 1920, 1080));
        primaryStage.show();

        stage = primaryStage;

        Bruger bruger = new Bruger("Test", "dinmor");

    }
}
