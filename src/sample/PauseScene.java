package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

public class PauseScene {

    private Stage primaryStage;

    Game someGame = Game.getinstance();

    @FXML
    private void resume(ActionEvent we) throws IOException, ClassNotFoundException {

        Controller.game_coins= someGame.getW().getCoins();
        Controller.game_score= someGame.getW().getScore();
        Controller.x_back = someGame.getX_back();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();

    }

    @FXML
    private void save_game(ActionEvent we) throws IOException, ClassNotFoundException {
        Parent root = FXMLLoader.load(getClass().getResource("slot_choice.fxml"));
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setWidth(660);
        primaryStage.setHeight(447);
        primaryStage.show();
    }

    @FXML
    private void exit(ActionEvent we) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
