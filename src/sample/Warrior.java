package sample;

import javafx.animation.*;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class Warrior{

    private Helmet h;
    private int coins = 0;
    private ImageView im;
    private boolean alive;
    private int w_status;
    private int score = 0;


    public boolean getAlive(){
        return alive;
    }
    public void setAlive(boolean b){
        alive=b;
    }

    public Warrior(){
        h = new Helmet();
        coins = 0;
        alive = true;
        w_status = 0;
    }

    public void setW_status(int b){
        w_status = b;
    }

    public int getW_status(){
        return w_status;
    }

    public void warrior_jump(ImageView w){
        if (w.getImage() != null) {
            TranslateTransition jump = new TranslateTransition();
            jump.setNode(w);
            jump.setDuration(Duration.millis(500));
            jump.setInterpolator(Interpolator.EASE_OUT);
            jump.setCycleCount(TranslateTransition.INDEFINITE);

            jump.setByY(120);
            jump.setAutoReverse(true);
            jump.play();
        }
    }
    public void warrior_jump_down(ImageView w){
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(w);
        jump.setDuration(Duration.millis(500));
        jump.setInterpolator(Interpolator.EASE_OUT);
        jump.setByY(200);

        jump.play();
    }

    public void warrior_opp_jump(ImageView w){
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(w);
        jump.setDuration(Duration.millis(500));
        jump.setInterpolator(Interpolator.EASE_OUT);
        jump.setByY(500);

        jump.play();
    }

    public void setCoins(int coins){
        this.coins = coins;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    public int getCoins(){
        return coins;
    }




}
