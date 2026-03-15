/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//an subclass the inherits methods and variables from the Super class Character
public class Enemies extends Character{
    //global variables for Enemies' morality, name and health
    private static int morality;
    private static String name;
    private static int health;
    
    //a constructor for name, health and morality
    public Enemies(String passname, int passhealth, int passmorality){
        name = passname;
        health = passhealth;
        morality = passmorality;
    }
    
    //Since we are extending an abstract class, most methods with abstarct from Character class must be overrided 
    //method to get the name of Odyesseus
    @Override
    public String getName(){
        return name;
    }
    //method to set the name of Enemy
    @Override
    public void setName(String passname){
        name = passname;
    }
    
    //method to get the health of Enemy
    @Override
    public int getHealth(){
        return health;
    }
    
    //method to set the health of Enemy
    @Override
    public void setHealth(int passhealth){
        health = passhealth;
    }
    
    //method to change the health of Enemy
    @Override
    public void changeHealth(int number){
        health = health + number;
    }
    
    //method to get the morality of Enemy
    @Override
    public int getMorality(){
        return morality;
    }
    //method to set the morality of Enemy
    @Override
    public void setMorality(int passmorality){
        morality = passmorality;
    }
    //method to change the morality of Enemy
    @Override
    public void changeMorality(int number){
        morality = morality + number;
    }
    
    //method to display the enemy's status
    @Override
    public void displayStatus(){
        System.out.println(name + "'s Health: " + getHealth());
    }//end of displayStatus
    
}//end of Enemies