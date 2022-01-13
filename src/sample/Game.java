package sample;

public class Game {

    private static Game onlyGame;
    private Warrior w;
    private double x;
    private double y; // layout save hoga yeh
    private double x_back;
    private int w_status;
    private double sword_x;
    private double axe_x;
    private boolean not_saved;


    public static Game getinstance(){
        if(onlyGame == null){
            onlyGame = new Game();
        }
        return onlyGame;
    }


    private Game(){
        w = new Warrior();
        w.setCoins(0);
        w.setScore(0);
        w.setW_status(0);
        x = 112;
        y = 50;
        x_back = -4;
        w_status = 0;
        not_saved = true;
        sword_x = 150;
        axe_x = 116;

    }

    public void setCoins(int coins){
        w.setCoins(coins);
    }

    public void setScore(int score){
        w.setScore(score);
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Warrior getW(){
        return w;
    }

    public double getX_back(){
        return x_back;
    }

    public void setX_back(double x_back){
        this.x_back = x_back;
    }

    public int getW_status() {
        return w_status;
    }

    public void setW_status(int w_status) {
        this.w_status = w_status;
    }

    public void setNot_saved(boolean not_saved) {
        this.not_saved = not_saved;
    }

    public boolean getNot_saved(){
        return not_saved;
    }

    public double getSword_x() {
        return sword_x;
    }

    public void setSword_x(double sword_x) {
        this.sword_x = sword_x;
    }

    public double getAxe_x() {
        return axe_x;
    }

    public void setAxe_x(double axe_x) {
        this.axe_x = axe_x;
    }
}
