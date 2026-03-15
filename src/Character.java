/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//An abstract class of Character
public abstract class Character{
    //global variables of name, health and the morality
    private String name;
    private int health;
    private int morality;
    
    
    //Abstract method to get the name of a Character
    public abstract String getName();
    //method to set the name of a Character
    public abstract void setName(String passname);
    
    //Abstract method to get the health of a Character
    public abstract int getHealth();
    //Abstract method to set the health of a Character
    public abstract void setHealth(int passhealth);
    //Abstract method to change the health of a Character
    public abstract void changeHealth(int number);

     //Abstract method to get the morality of a Character
    public abstract int getMorality();
    //Abstract method to set the morality of a Character
    public abstract void setMorality(int passmorality);
    //Abstract method to change the morality of a Character
    public abstract void changeMorality(int number);
    
    //Abstract method to display the Character's status
    public abstract void displayStatus();
    
}//end of Character