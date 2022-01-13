package sample;

import java.util.ArrayList;

public class Helmet {

    private ArrayList<Weapon> weapons_list;

    public Helmet(){
        Sword s = new Sword(25, 1);
        Axe a = new Axe(25, 2);
        weapons_list = new ArrayList<Weapon>();
        weapons_list.add(s);
        weapons_list.add(a);
    }
}
