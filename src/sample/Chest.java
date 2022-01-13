package sample;

import javafx.scene.image.Image;

public abstract class Chest {
    public Chest(){

    }

    public abstract Image getIm1();

    public abstract boolean getUsed();

    public abstract void setUsed();

    public abstract int getType();

}
