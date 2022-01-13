package sample;

public class Sword extends Weapon{

    private int power = 25;
    private int type;

    public Sword(int power, int type) {
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
