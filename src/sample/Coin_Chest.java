package sample;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Coin_Chest extends Chest{

    ImageView im;
    Image paisa = new Image("paisa.png");
    private boolean used;
    private int type = 0;

    public Coin_Chest(ImageView im){
        final int COINS = 5;
        this.im = im;
        used = false;
    }

    @Override
    public Image getIm1(){
        return paisa;
    }

    @Override
    public boolean getUsed(){
        return used;
    }

    @Override
    public void setUsed(){
        used = true;
    }

    @Override
    public int getType(){
        return type;
    }

}
