package main.Characters.damage.thing;

import main.Characters.Base;
import main.Characters.damage.Damage;

public class Assasin extends Damage {
    //high AD
    //execute
    //dodge change

    public Assasin(double health, double AD, double AP, double mana, boolean alive) {
        super(health, AD, AP, mana, alive);
    }

    public void execute(Base other){
        other.die();
    }


}
