/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//The class representing Scylla
public class Scylla {
    //the encounter with the six-headed monster
    public static void sixHeadedMonster() {
        //Scylla's attack
        Tools.typeWriterVariables(("Scylla attacks your ship with her 6 heads and drags 6 of your crew away"), 50);
        
        //damage to the spaceship
        System.out.println("- 100 Ship Health");
        SpaceShip.setShipHealth(-100);
        System.out.println("Space Ship Health: " + (SpaceShip.getShipHealth()));
        
        //6 of the crew dies
        SpaceShip.setCrewmates(-6);
        
        Tools.typeWriterVariables(("You escaped Scylla"), 50);
    }//end of sixHeadedMonster()
}//end of Scylla