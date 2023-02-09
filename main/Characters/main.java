package main.Characters;


import main.Characters.damage.thing.Assasin;
import main.Characters.fighter.Fighter;
import main.Characters.tank.Tank;
import java.util.*;
public class main {

    static volatile boolean game = true;

    static Base Assasin = new Assasin();

    Scanner input = new Scanner(System.in);
    static Base Player1 = new Assasin(100, 12, 30,50, true);
    static Base Player2 = new Fighter(100, 12, 30, 5, 50, true);
    Assasin Player1D = (Assasin) Player1;

    Fighter Player2D = (Fighter) Player2;

    public static void main(String[] args){





    }


}
