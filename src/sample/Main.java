package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    Stage st1;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("load_screen.fxml"));
        Scene scene = new Scene(root, 650, 550);
        primaryStage.setTitle("Will Hero");
        Image icon = new Image("icon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(scene);
        primaryStage.setHeight(380);
        primaryStage.setWidth(560);
        primaryStage.setResizable(false);
        st1 = primaryStage;
        primaryStage.show();

    }

    public Stage getStage(){
        return st1;
    }

    public static void main(String[] args) {
        launch(args);
    }
}