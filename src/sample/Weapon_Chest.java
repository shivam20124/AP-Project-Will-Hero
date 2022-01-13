package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Weapon_Chest extends Chest{

    private Weapon w;
    private Image im;
    private ImageView im1;
    private boolean used;
    private int type;

    public Weapon_Chest(ImageView im1, int type){
        this.im1 = im1;
        used = false;
        this.type = type;
        if (type == 1){
            im = new Image("talvaar.png");
        }
        else if(type == 2){
            im = new Image("axe_chest.png");
        }
    }

    @Override
    public Image getIm1(){
        return im;
    }

    @Override
    public boolean getUsed() {
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
