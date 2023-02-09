package main.Characters.damage.thing;

import main.Characters.Base;
import main.Characters.damage.Damage;

public class Mage extends Damage {

    //high AP
    //modified mana points
    public Mage(double health, double AD, double AP, double mana, boolean alive) {
        super(health, AD, AP, mana, alive);
    }

    public void basicAttack(Base other){
       other.getHit( super.getAP()*0.5 + super.getAD() *0.5);
    }
}
