package main.Characters.damage.thing;

import main.Characters.Base;
import main.Characters.damage.Damage;

public class Assasin extends Damage {
    //high AD
    //execute
    //dodge change
    static double executeMoveCost = 15;

    public Assasin(double health, double AD, double AP, double mana, boolean alive) {
        super(health, AD, AP, mana, alive);
    }
    public Assasin(){
        super(20, 15);
    }

    public void execute(Base other){
        if(manaCheck(executeMoveCost)) {
            other.die();
        }
        else{
            System.out.println("Cannot use execute move, not enough mana");
        }
    }

    public void slash(Base other){
        other.getHit(super.getAD()*2);
    }


}
