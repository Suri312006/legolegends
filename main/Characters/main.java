package main.Characters;


import main.Characters.damage.thing.Assasin;
import main.Characters.fighter.Fighter;
import main.Characters.tank.Tank;
import main.Characters.damage.thing.Mage;
public class main {


    static Base Assasin = new Assasin();
    static Base Tank = new Tank();
    static Base Fighter = new Fighter();
    static Base Mage = new Mage();

    static Assasin assasin = (Assasin)Assasin;
    static  Tank tank = (Tank)Tank;
    static Fighter fighter = (Fighter)Fighter;
    static Mage mage = (Mage)Mage;


    // defining the type of character each player is using
    static Assasin Player1 = assasin;

    static Fighter Player2 = fighter;

    public static void main(String[] args){

        //examples of movesets
        healthReportP2();
        Player1.basicAttack(Player2);
        sop("Player 1 used Basic attack on Player 2");
        healthReportP2();
        Player2.bite(Player1);
        sop("Player 2 used bite on Player 1");
        healthReportP1();
        Player1.Barrage(Player2);
        sop("Player 1 used Barrage on Player 2");
        healthReportP2();
        Player2.seriousPunch(Player1);
        sop("Player 2 used Serious Punch on Player 1");
        healthReportP1();
        Player1.slash(Player2);
        sop("Player 1 used Slash on Player 2");
        healthReportP2();
        sop("Player 1 wins!");




    }

    public static void healthReportP1(){
        System.out.println("Player 1 now has "+(int) Player1.getHealth()+" health.");
    }
    public static void healthReportP2(){
        System.out.println("Player 2 now has "+(int) Player2.getHealth()+".");
    }
    public static void sop(String a){
        System.out.println(a);
    }


}
