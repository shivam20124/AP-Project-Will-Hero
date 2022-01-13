package sample;

public class Axe extends Weapon{

    private int power=25;
    private int type;

    public Axe(int power, int type) {
        this.power = power;
        this.type = type;
    }

    @Override
    public int getType(){
        return type;
    }

    @Override
    public int getPower(){
        return power;
    }
}
