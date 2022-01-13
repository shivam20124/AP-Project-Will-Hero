package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class SavedGames implements Initializable {
    @FXML
    private Label score_slot1;
    @FXML
    private Label score_slot2;
    @FXML
    private Label score_slot3;
    @FXML
    private Label score_slot4;
    @FXML
    private Button back;

    private Stage primaryStage;
    private int high_score=0;

    public int score1;
    public int score2;
    public int score3;
    public int score4;


    public SavedGames() throws IOException, ClassNotFoundException {
        try {
            Saving_class get_it1 = null;
            FileInputStream filein1 = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\save_new_game_1.ser");
            ObjectInputStream in1 = new ObjectInputStream(filein1);
            get_it1 = (Saving_class) in1.readObject();
            in1.close();
            filein1.close();
            score1 = get_it1.score;
        }
        catch(FileNotFoundException excep1){
            System.out.println("1st game not saved");
        }

        try {
            Saving_class get_it2 = null;
            FileInputStream filein2 = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\save_new_game_2.ser");
            ObjectInputStream in2 = new ObjectInputStream(filein2);
            get_it2 = (Saving_class) in2.readObject();
            in2.close();
            filein2.close();
            score2 = get_it2.score;
        }
        catch(FileNotFoundException excep2){
            System.out.println("2nd game not saved");
        }

        try {
            Saving_class get_it3 = null;
            FileInputStream filein3 = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\save_new_game_3.ser");
            ObjectInputStream in3 = new ObjectInputStream(filein3);
            get_it3 = (Saving_class) in3.readObject();
            in3.close();
            filein3.close();
            score3 = get_it3.score;
        }
        catch(FileNotFoundException excep){
            System.out.println("3rd game not saved");
        }


        try{
            Saving_class get_it4 = null;
            FileInputStream filein4 = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\save_new_game_4.ser");
            ObjectInputStream in4 = new ObjectInputStream(filein4);
            get_it4 = (Saving_class) in4.readObject();
            in4.close();
            filein4.close();
            score4=get_it4.score;
        }
        catch(FileNotFoundException excep4){
            System.out.println("4th game not saved");
        }
    }

    Game someGame = Game.getinstance();

    public void goingback(ActionEvent e0) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage = (Stage) ((Node) e0.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setHeight(380);
        primaryStage.setWidth(560);
        primaryStage.show();
    }

    public void load_1(ActionEvent e1) throws IOException, ClassNotFoundException {
        try {
            Saving_class get_it = null;
            FileInputStream filein = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\save_new_game_1.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            get_it = (Saving_class) in.readObject();
            in.close();
            filein.close();
            someGame.setCoins(get_it.coins);
            someGame.setScore(get_it.score);
            someGame.setX(get_it.x_coordinate);
            someGame.setX_back(get_it.screen_back);
            someGame.setW_status(get_it.w_status);
            someGame.setNot_saved(get_it.not_saved);
            score1 = get_it.score;
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage = (Stage) ((Node) e1.getSource()).getScene().getWindow();
            Scene sc = new Scene(root);
            primaryStage.setScene(sc);
            primaryStage.setHeight(380);
            primaryStage.setWidth(560);
            primaryStage.show();
        }
        catch(FileNotFoundException exp1){
            System.out.println("Slot 1 does not exist right now");
        }
    }

    public void load_2(ActionEvent e1) throws IOException, ClassNotFoundException {
        try {
            Saving_class get_it = null;
            FileInputStream filein = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\save_new_game_2.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            get_it = (Saving_class) in.readObject();
            in.close();
            filein.close();
            someGame.setCoins(get_it.coins);
            score2 = get_it.score;
            someGame.setScore(get_it.score);
            someGame.setX(get_it.x_coordinate);
            someGame.setX_back(get_it.screen_back);
            someGame.setW_status(get_it.w_status);
            someGame.setNot_saved(get_it.not_saved);
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage = (Stage) ((Node) e1.getSource()).getScene().getWindow();
            Scene sc = new Scene(root);
            primaryStage.setScene(sc);
            primaryStage.setHeight(380);
            primaryStage.setWidth(560);
            primaryStage.show();
        }
        catch(FileNotFoundException exp2){
            System.out.println("Slot 2 does not exist right now");
        }
    }

    public void load_3(ActionEvent e1) throws IOException, ClassNotFoundException {
        try {
            Saving_class get_it = null;
            FileInputStream filein = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\save_new_game_3.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            get_it = (Saving_class) in.readObject();
            in.close();
            filein.close();
            someGame.setCoins(get_it.coins);
            someGame.setScore(get_it.score);
            score3 = get_it.score;
            someGame.setX(get_it.x_coordinate);
            someGame.setX_back(get_it.screen_back);
            someGame.setW_status(get_it.w_status);
            someGame.setNot_saved(get_it.not_saved);
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage = (Stage) ((Node) e1.getSource()).getScene().getWindow();
            Scene sc = new Scene(root);
            primaryStage.setScene(sc);
            primaryStage.setHeight(380);
            primaryStage.setWidth(560);
            primaryStage.show();
        }
        catch(FileNotFoundException exp3){
            System.out.println("Slot 3 does not exist right now");
        }

    }

    public void load_4(ActionEvent e1) throws IOException, ClassNotFoundException {
        try {
            Saving_class get_it = null;
            FileInputStream filein = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\save_new_game_4.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            get_it = (Saving_class) in.readObject();
            in.close();
            filein.close();

            someGame.setCoins(get_it.coins);
            score4 = get_it.score;
            someGame.setScore(get_it.score);
            someGame.setX(get_it.x_coordinate);
            someGame.setX_back(get_it.screen_back);
            someGame.setW_status(get_it.w_status);
            someGame.setNot_saved(get_it.not_saved);
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage = (Stage) ((Node) e1.getSource()).getScene().getWindow();
            Scene sc = new Scene(root);
            primaryStage.setScene(sc);
            primaryStage.setHeight(380);
            primaryStage.setWidth(560);
            primaryStage.show();
        }
        catch (FileNotFoundException exp4){
            System.out.println("Slot 4 does not exist right now");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        score_slot1.setText(String.valueOf(score1));
        score_slot2.setText(String.valueOf(score2));
        score_slot3.setText(String.valueOf(score3));
        score_slot4.setText(String.valueOf(score4));
    }
}
