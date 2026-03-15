/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use input and scan files
import java.util.*;

//an subclass the inherits methods and variables from the Super class Character
public class Odysseus extends Character{
    //global variables for Odysseus's morality, wisdom, name and health
    private static int morality;
    private static int wisdom;
    private static String name;
    private static int health;
    
    //global scanner
    static Scanner s = new Scanner(System.in);
    
    //a constructor for name, health, wisdom and morality
    public Odysseus(String passname, int passhealth, int passmorality, int passwisdom){
        name = passname;
        health = passhealth;
        morality = passmorality;
        wisdom = passwisdom;
    }
    
    //Since we are extending an abstract class, most methods with abstarct from Character class must be overrided 
    
    //method to get the name of Odyesseus
    @Override
    public String getName(){
        return name;
    }
    //method to set the name of Odyesseus
    @Override
    public void setName(String passname){
        name = passname;
    }
    
    //method to get the health of Odyesseus
    @Override
    public int getHealth(){
        return health;
    }
    
    //method to set the health of Odyesseus
    @Override
    public void setHealth(int passhealth){
        health = passhealth;
    }
    
    //method to change the health of Odyesseus
    @Override
    public void changeHealth(int number){
        health = health + number;
    }
    
    //method to get the morality of Odyesseus
    @Override
    public int getMorality(){
        return morality;
    }
    //method to set the morality of Odyesseus
    @Override
    public void setMorality(int passmorality){
        morality = passmorality;
    }
    //method to change the morality of Odyesseus
    @Override
    public void changeMorality(int number){
        morality = morality + number;
    }
    
    //method to display the Game Status - your Health & Ships health and # of crewmates
    @Override
    public void displayStatus(){
        System.out.println();
        System.out.println("Game Stats");
        System.out.println("Your Health: " + getHealth());
        //calls a method from the SpaceShip class to get health
        System.out.println("Ship's Health: " + (SpaceShip.getShipHealth()));
        System.out.println("Number of Crewmates left: " + (SpaceShip.getCrewmates()));
        //continue prompt
        System.out.print("Press Enter to Continue the Game!");
        s.nextLine();
        //the console is cleared
        Tools.clearConsole(100);
    }//end of displayStatus
    
    //method to get the wisdom of Odyesseus
    public int getWisdom(){
        return wisdom;
    }
    //method to set the wisdom of Odyesseus
    public void setWisdom(int passwisdom){
        wisdom = passwisdom;
    }
    //method to change the wisdom of Odyesseus
    public void changeWisdom(int number){
        wisdom = wisdom + number;
    }
}//end of Odyesseus