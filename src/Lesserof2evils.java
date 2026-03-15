/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use input and scan files
import java.util.*;

//a class representing the moral dilemma between Scylla and Charybdis
public class Lesserof2evils{
    
    //a method to make a choice between Scylla and Charybdis - mc object is passed from main class
    public static void choose(Odysseus mc){
        //tells you about Scylla and Charybdis
        Tools.typeWriterVariables(("In the space between the galaxies of Sicily and Calabria connected, two legendary celestial monsters, Scylla and Charybdis, wait on either side for ignorant ships to pass by them."), 50);
        System.out.println();
        
        Tools.typeWriterVariables(("Scylla is a planet-sized 6-headed space monster that would eat 6 of your crewmates if you get close to her side of the expanse"), 50);
        Tools.typeWriterVariables(("On the other side, Charybdis is a monstrous space whirlpool who sends vortexes to drag your spaceship in "), 50);
        
        //asks the user whihc way they want to go
        Tools.typeWriterVariables(("Do you sacrifice 6 of your crewmates to Scylla or risk it all to travel by Charybdis"), 50);

        Tools.typeWriterVariables(("What is the lesser of the 2 evils then: "), 50);
        System.out.println("1. Scylla");
        System.out.println("2. Charybdis");

        int path = Tools.getUserInput(1, 2);
        System.out.println();
        Tools.clearConsole(100);
        
        //user's wisdom and morality is impacted by the choice
        if (path == 1){
            //calls the Scylla class
            Scylla.sixHeadedMonster();
            mc.changeWisdom(5);  
            mc.changeMorality(-5);
        }//end of if
        else {
            //calls the Charybdis class
            Charybdis.spaceStorm(mc);
            mc.changeWisdom(-2);  
            mc.changeMorality(2);
        }//end of else
    }//end of choose
}//end of Lesserof2evils