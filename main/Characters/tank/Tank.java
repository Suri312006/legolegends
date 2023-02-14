package main.Characters.tank;

import main.Characters.Base;
public class Tank extends Base{
    private double armor;
    private boolean stall;

    private double healAmount;

    public Tank(double health, double AD, double AP, double healAmount, double mana, double armor, boolean alive) {
        super(health, AD, AP,mana, alive);
        this.armor = armor;
        this.healAmount = healAmount;
    }
    public Tank() {
        super(150, 7, 15,30, true);
        this.armor =20;
        this.healAmount = 15;
    }

    public void stallMove(){
        stall = true;
    }
    public void hit(double damage, Base other){
        if(!stall) {
            super.getHit(damage*(1-armor));
        }
        else{
            other.getHit(armor * 0.5);
        }
        stall = false;

    }

    public boolean getStall(){
        return stall;
    }

    public void heal(){
        super.addHealth(20);
    }
}