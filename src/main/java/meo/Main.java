package meo;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private VBox dialogContainer;
    private TextField userInput;
    private Image userImage = new Image(this.getClass().getResourceAsStream("/images/user.png"));
    private Image meoImage = new Image(this.getClass().getResourceAsStream("/images/meo.png"));
    private Meo meo = new Meo();

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setMeo(meo);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
