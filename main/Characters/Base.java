package main.Characters;
public class Base {
    private double health;
    private double AD;
    private double AP;
    private double mana;
    private boolean alive;

    private double defHealth = 100;
    private double defAD = 15;
    private double defAP = 20;
    private double defMana = 40;
    private boolean defAlive = true;



    public Base(){
        this.health = defHealth;
        this.AD = defAD;
        this.AP = defAP;
        this.mana = defMana;
        this.alive = defAlive;
    }
    public Base(double AD, double AP){
        this.health = defHealth;
        this.AD = AD;
        this.AP = defAP;
        this.mana = defMana;
        this.alive = defAlive;
    }
    public Base(double health, double AD, double AP,double mana, boolean alive){
        this.health = health;
        this.AD = AD;
        this.AP = AP;
        this.mana = mana;
        this.alive = alive;
    }

    //accessor methods
    public double getHealth(){
        if(health < 0){
            return 0;
        }
        return health;
    }
    public double getAP(){
        return AP;
    }
    public double getAD(){
        return AD;
    }
    public double getMana(){
        return mana;
    }
    public boolean getAlive(){
        return alive;
    }

    public void addHealth(double additionalHealth){
        health+=additionalHealth;
    }

    //mutator methods
    public void getHit(double damage){
        health -= damage;
    }
    public void hit(Base other, double damage){
        other.getHit(damage);
    }

    public boolean manaCheck(double moveCost){
        if(mana > moveCost){
            mana-=moveCost;
            return true;
        }
        return false;
    }

    public void die(){
        alive = false;
    }


    //game methods
    public void basicAttack(Base other){
        hit(other,this.AD);
    }




}
