package main.Characters.damage;

import main.Characters.Base;

public class Damage extends Base {

    private double barrageCost = 15;
    public Damage(double health, double AD, double AP, double mana, boolean alive) {
        super(health, AD, AP, mana, alive);
    }
    public Damage(double AD, double AP) {
        super(AD, AP);
    }
    //less hp than the other characters
    public void Barrage(Base other){
        if(manaCheck(barrageCost)) {
            other.getHit(2*super.getAD()+super.getAD());
        }
        else{
            System.out.println("Cannot use barrage move, not enough mana");
        }

    }
    //special attack (nah doesnt make sense)


}