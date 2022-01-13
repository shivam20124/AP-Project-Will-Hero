package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SlotChoice{
    private Stage primaryStage;
    Game someGame = Game.getinstance();
    @FXML
    private void save_game_1(ActionEvent we) throws IOException, ClassNotFoundException {
        Saving_class try_obj = new Saving_class();
        try_obj.coins=someGame.getW().getCoins();
        try_obj.score=someGame.getW().getScore();
        try_obj.x_coordinate= someGame.getX();
        try_obj.screen_back= someGame.getX_back();
        try_obj.not_saved = someGame.getNot_saved();
        try_obj.w_status = someGame.getW_status();
        try_obj.sword_x = someGame.getSword_x();
        try_obj.axe_x = someGame.getAxe_x();
        FileOutputStream fileout = new FileOutputStream("save_new_game_1.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(try_obj);
        out.close();
        fileout.close();
        System.out.println("Game saved!!");

        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setHeight(380);
        primaryStage.setWidth(560);
        primaryStage.show();

    }

    @FXML
    private void save_game_2(ActionEvent we) throws IOException, ClassNotFoundException {

        Saving_class try_obj = new Saving_class();
        try_obj.coins=someGame.getW().getCoins();
        try_obj.score=someGame.getW().getScore();

        try_obj.x_coordinate= someGame.getX();
        try_obj.screen_back= someGame.getX_back();
        try_obj.not_saved = someGame.getNot_saved();
        try_obj.w_status = someGame.getW_status();
        try_obj.sword_x = someGame.getSword_x();
        try_obj.axe_x = someGame.getAxe_x();
        FileOutputStream fileout = new FileOutputStream("save_new_game_2.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(try_obj);
        out.close();
        fileout.close();
        System.out.println("Game saved!!");

        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setHeight(380);
        primaryStage.setWidth(560);
        primaryStage.show();

    }

    @FXML
    private void save_game_3(ActionEvent we) throws IOException, ClassNotFoundException {

        Saving_class try_obj = new Saving_class();
        try_obj.coins=someGame.getW().getCoins();
        try_obj.score=someGame.getW().getScore();

        try_obj.x_coordinate= someGame.getX();
        try_obj.screen_back= someGame.getX_back();
        try_obj.not_saved = someGame.getNot_saved();
        try_obj.w_status = someGame.getW_status();
        try_obj.sword_x = someGame.getSword_x();
        try_obj.axe_x = someGame.getAxe_x();
        FileOutputStream fileout = new FileOutputStream("save_new_game_3.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(try_obj);
        out.close();
        fileout.close();
        System.out.println("Game saved!!");

        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setHeight(380);
        primaryStage.setWidth(560);
        primaryStage.show();

    }

    @FXML
    private void save_game_4(ActionEvent we) throws IOException, ClassNotFoundException{
        Saving_class try_obj = new Saving_class();
        try_obj.coins=someGame.getW().getCoins();
        try_obj.score=someGame.getW().getScore();
        try_obj.x_coordinate= someGame.getX();
        try_obj.screen_back= someGame.getX_back();
        try_obj.not_saved = someGame.getNot_saved();
        try_obj.w_status = someGame.getW_status();
        try_obj.sword_x = someGame.getSword_x();
        try_obj.axe_x = someGame.getAxe_x();
        FileOutputStream fileout = new FileOutputStream("save_new_game_4.ser");

        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(try_obj);
        out.close();
        fileout.close();
        System.out.println("Game saved!!");

        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setHeight(380);
        primaryStage.setWidth(560);
        primaryStage.show();

    }


}
