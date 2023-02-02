public class Base {
    private double health;
    private double AD;
    private double AP;
    private double armor;
    private double magicResist;
    private boolean alive;

    public Base(){
        this.health = 100;
        this.AD = 5;
        this.AP = 15;
        this.armor = 20;
        this.magicResist = 20;
        this.alive = true;
    }
    public Base(double health, double AD, double AP, double armor, double magicResist, boolean alive){
        this.health = health;
        this.AD = AD;
        this.AP = AP;
        this.armor = armor;
        this.magicResist = magicResist;
        this.alive = alive;
    }

    public void basicAttack( Base other){
        other.health -= this.AD;
    }

}
