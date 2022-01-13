package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Die1control {

    private Stage primaryStage;

    public void switch_to_die(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("die1.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
