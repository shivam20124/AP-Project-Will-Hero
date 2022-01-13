package sample;

import com.sun.javafx.scene.control.GlobalMenuAdapter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;


public class LoadScreen implements Initializable{
    @FXML
    private ProgressBar bar;

    @FXML
    private Button play_button;

    double progress;
    private Stage primaryStage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        bar.setStyle("-fx-accent: #00FF00;");
    }

    public void setPlay_button(){
        if(progress<1){
            progress += 1;
            bar.setProgress(progress);
        }
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}