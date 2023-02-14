package main.Characters.damage.thing;

import main.Characters.Base;
import main.Characters.damage.Damage;

public class Mage extends Damage {

    static double spellSurgeCost = 15;
    public Mage(double health, double AD, double AP, double mana, boolean alive) {
        super(health, AD, AP, mana, alive);
    }
    public Mage() {
        super(15, 40);
    }


    public void basicAttack(Base other){
       other.getHit( super.getAP()*0.5 + super.getAD() *0.5);
    }

    public void spellSurge(Base other){
        if(manaCheck(spellSurgeCost)) {
            other.getHit(super.getAP()*2);
        }
        else{
            System.out.println("Cannot use Spell Surge, not enough mana");
        }

    }
}
