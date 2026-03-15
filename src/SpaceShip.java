/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

public class SpaceShip {
    //global variables for Space Ship's name, crewmmates, and health
    private static int shipHealth;
    private static String name;
    private static int crewmates;

    //a constructor for name, and health
    public SpaceShip(){
        this.name = "The Homer 1200";
        this.shipHealth = 1000;
    }
    
    //method to set the health of ship
    public static void setShipHealth(int number){
        shipHealth = shipHealth + number;
    }
    //method to get the health of ship
    public static int getShipHealth(){
        return shipHealth;
    }
    //method to set the number of crewmates
    public static void setCrewmates(int number){
        crewmates = crewmates + number;
    }
    
    //method to get the number of crewmates
    public static int getCrewmates(){
        return crewmates;
    }
}//end of SpaceShip