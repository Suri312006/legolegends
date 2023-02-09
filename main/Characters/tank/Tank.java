package main.Characters.tank;

import main.Characters.Base;
public class Tank extends Base{
    private double armor;
    private boolean stall;

    public Tank(double health, double AD, double AP, double mana, double armor, boolean alive) {
        super(health, AD, AP,mana, alive);
        this.armor = armor;
    }

    public void stallMove(){
        stall = true;
    }
    public void hit(double damage, Base other){
        if(!stall) {
            super.hit(damage*(1-armor));
        }
        else{
            other.hit(armor * 0.5);
        }
        stall = false;

    }

    public boolean getStall(){
        return stall;
    }
}