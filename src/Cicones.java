/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use input and scan files
import java.util.*;

//A class with the game with different events and decisions involving the Cicones 
public class Cicones{
    //global scanner
    static Scanner s = new Scanner(System.in);
    
    //global object
    static Odysseus mc;
    
    //a method to start off the encounter with the Cicones - passes the object mc from main class
    //This class is used to change wisdom and morality of the object mc depending on your decisions
    public static void startJourney(Odysseus passCharacter){
        //The object is passed to the global variable
        mc = passCharacter;
        //Introduction to the Cicones
        Tools.typeWriterVariables(("Your navigator, Perimedes calls out to you and tells you that there seems to be a planetary system ahead."), 50);
        System.out.println("");
        Tools.typeWriterVariables(("As you approached, a mesmerizing sight unfolded — a radiant dwarf star surrounded by planets of  ethereal beauty, a celestial haven."), 50); 
        Tools.pause(1000);
        Tools.typeWriterVariables(("But awe quickly turns to anger, when it is found to be the Thrace system, home to Cicones who were allies of the Trojans"), 50);
        
        System.out.println();
        Tools.typeWriterVariables(("As the Captain, it is your job to choose what to do:"), 50);
        //You get to make a choice - input
        System.out.println("1. Maneuver around the planetary system and leave them alone");
        System.out.println("2. Enter the Thrace system");
        int decision1 = Tools.getUserInput(1, 2);

        if (decision1 == 1) {
            leaveThem();
            mc.changeWisdom(5);
        } 
        else{
            enter();
        }
    }//end of startJourney()

    //a method called when you leave the place
    public static void leaveThem(){
        Tools.typeWriterVariables(("You leave the Thrace system."), 50);
    }//end of leaveThem()

    //you chose to enter the system
    public static void enter() {
        System.out.println();
        Tools.typeWriterVariables(("You come across a stranded Cironian ship. What do you do?"), 50);
        //a decision to make
        System.out.println("1. Capture them");
        System.out.println("2. Spare them");
        
        int decision2 = Tools.getUserInput(1, 2);

        if (decision2 == 1) {
            System.out.println();
            Tools.typeWriterVariables(("You capture the astray ship and its crew, and learn that the Cicones know your're in their home."), 50);
            mc.changeWisdom(7);
            mc.changeMorality(-2);
            
            System.out.println("1. Attack them");
            System.out.println("2. Leave the system");
            int decision3 = Tools.getUserInput(1, 2);
            
            if (decision3 == 1){
                attackThem(1);
                mc.changeMorality(-3);
            }
            else{
                mc.changeWisdom(3);
                leaveThem();
            }
        }
        
        else{
            System.out.println();
            Tools.typeWriterVariables(("You leave the ship to be, but supplies are running low."), 50);
            mc.changeMorality(5);
            System.out.println("1. Steal supplies from the central planet, Ismara");
            System.out.println("2. Leave the system");
            int decision4 = Tools.getUserInput(1, 2);
            
            if (decision4 == 1){
                attackThem(2);
                mc.changeWisdom(2);
                mc.changeMorality(-3);
            }//end of if
            else{
                mc.changeMorality(3);
                mc.changeWisdom(-2);
                leaveThem();
            }//end of else
        }//end of else
    }//end of enter
    
    public static void attackThem(int x){
        System.out.println();
        Tools.typeWriterVariables(("You attack the Circones' Home planet, Ismara and are successful in catching them off guard"), 50);
        if (x == 1){
            System.out.println("1. Kill them all to seek revenge for your fallen comrades in the Trojan War");
            System.out.println("2. Take all their supplies but spare them");
            int decision4 = Tools.getUserInput(1, 2);
            if (decision4 == 1){
                Tools.typeWriterVariables(("Surrounded by the radiance of plasma beams and the chaos of quantum disruptors, you emerge victorious. "), 50);
                mc.changeMorality(-7);
            }//end of if
        }//end of if
        
        else{
            Tools.typeWriterVariables(("You are able to get some supplies"), 50);
            mc.changeWisdom(3);
            
        }//end of else
       
        Tools.typeWriterVariables(("With the arrival of reinforcements, your triumphant crew steadily departs, as victors once again."), 50);
        leaveThem();
    }//end of attackThem
}//end of Cicones