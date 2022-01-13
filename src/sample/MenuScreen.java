package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;



public class MenuScreen implements Initializable{
    private Stage primaryStage;
    private int high_score=0;

    Game someGame = Game.getinstance();
    public int score1;
    public int score2;
    public int score3;
    public int score4;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void switch_to_play(ActionEvent event) throws IOException {
        someGame.setCoins(0);
        someGame.setScore(0);
        someGame.setX(112);
        someGame.setY(50);
        someGame.setX_back(-4);
        someGame.setW_status(0);
        someGame.setNot_saved(true);
        Controller.game_coins= 0;
        Controller.game_score= 0;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public void View_HighScore(ActionEvent event) throws IOException, ClassNotFoundException {
        try {
            Saving_class get_it1 = null;
            FileInputStream filein1 = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\save_new_game_1.ser");
            ObjectInputStream in1 = new ObjectInputStream(filein1);
            get_it1 = (Saving_class) in1.readObject();
            in1.close();
            filein1.close();
            score1 = get_it1.score;
        }
        catch(FileNotFoundException f1){
            score1 = 0;
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
        catch(FileNotFoundException f2){
            score2 = 0;
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
        catch(FileNotFoundException f3){
            score3 = 0;
        }

        try {
            Saving_class get_it4 = null;
            FileInputStream filein4 = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\save_new_game_4.ser");
            ObjectInputStream in4 = new ObjectInputStream(filein4);
            get_it4 = (Saving_class) in4.readObject();
            in4.close();
            filein4.close();
            score4 = get_it4.score;
        }
        catch(FileNotFoundException f4){
            score4 = 0;
        }

        int a = Math.max(score1,score2);
        int b = Math.max(score3,score4);
        int high = Math.max(a,b);

        Save_highscore try_obj = new Save_highscore();
        try_obj.high_score=high;
        FileOutputStream fileout = new FileOutputStream("high_score_file.ser");

        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(try_obj);
        out.close();
        fileout.close();


        Save_highscore get_it = null;
        FileInputStream filein = new FileInputStream("C:\\Users\\shiva\\IdeaProjects\\new\\high_score_file.ser");
        ObjectInputStream in = new ObjectInputStream(filein);
        get_it = (Save_highscore) in.readObject();
        in.close();
        filein.close();
        System.out.println("Current high score: "+get_it.high_score);

    }

    public void load_game(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("saved_games.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setHeight(441);
        primaryStage.setWidth(620);
        primaryStage.setScene(sc);
        primaryStage.show();
    }




    public void exit_game(ActionEvent event) throws IOException {
        System.exit(0);
    }
}
