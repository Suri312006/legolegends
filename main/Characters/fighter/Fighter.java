package main.Characters.fighter;

import main.Characters.Base;

public class Fighter extends Base {

    //Basic attack damage inversely scales with HP?
    private double maxHpPercentage;

    private static double InverseADMult = 2;

    private static double seriousPunchCost = 25;

    public Fighter(double health, double AD, double AP, double maxHpPercentage, double mana, boolean alive) {
        super(health, AD, AP, mana, alive);
        this.maxHpPercentage = maxHpPercentage;
    }
    public Fighter() {
        super(120, 20, 25, 40, true);
        this.maxHpPercentage = 0.15;
    }

    //bite method that does percentage HP damage
    public void bite(Base other){
        other.getHit(other.getHealth()*maxHpPercentage);
    }

    public void basicAttack(Base other){
        other.getHit(this.getAD() *(1+InverseADMult*(1/getHealth())));
    }

    public void seriousPunch(Base other){
        if(manaCheck(seriousPunchCost)) {
            other.getHit(other.getHealth()*InverseADMult*(1/(this.getHealth()*0.1)));
        }
        else{
            System.out.println("Cannot use Serious Punch move, not enough mana");
        }
    }


}
