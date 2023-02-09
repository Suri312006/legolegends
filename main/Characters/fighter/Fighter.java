package main.Characters.fighter;

import main.Characters.Base;

public class Fighter extends Base {

    //Basic attack damage inversely scales with HP?
    private double maxHpPercentage;

    private double InverseADMult = 1;

    public Fighter(double health, double AD, double AP, double maxHpPercentage, double mana, boolean alive) {
        super(health, AD, AP, mana, alive);
        this.maxHpPercentage = maxHpPercentage;
    }

    //bite method that does percentage HP damage
    public void bite(Base other){
        other.hit(other.getHealth()*maxHpPercentage);
    }

    public void basicAttack(Base other){
        other.hit(this.getAD() *(1+InverseADMult*(1/getHealth())));
    }
}
