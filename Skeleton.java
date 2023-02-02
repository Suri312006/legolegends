public class Skeleton {
    private double health;
    private double AD;
    private double AP;
    private double armor;
    private double magicResist;
    private boolean alive;

    public Skeleton(double health, double AD, double AP, double armor, double magicResist, boolean alive){
        this.health = health;
        this.AD = AD;
        this.AP = AP;
        this.armor = armor;
        this.magicResist = magicResist;
        this.alive = alive;
    }

    public void basicAttack( Skeleton other){
        other.health -= this.AD;
    }

}
