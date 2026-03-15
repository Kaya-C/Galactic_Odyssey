/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use input and scan files
import java.util.*;

//a method that is used for tell the user's journey home at long last
public class JourneyHome {
    //global scanner
    static Scanner l = new Scanner(System.in);

    //a method for spaceship building
    public static void shipBuilding() {
        System.out.println();
        
        // Choose spaceship engine
        Tools.typeWriterVariables(("Choose your spaceship engine:"), 50);
        System.out.println("1. Solar Engine");
        System.out.println("2. Plasma Engine");
        int engineChoice = Tools.getUserInput(1, 2);
        System.out.println();

        // Choose spaceship hull
        Tools.typeWriterVariables(("Choose your spaceship hull:"), 50);
        System.out.println("1. Lonsdaleite Hull");
        System.out.println("2. Nuclear Pasta Hull");
        int hullChoice = Tools.getUserInput(1, 2);
        System.out.println();

        // Choose spaceship weapon
        Tools.typeWriterVariables(("Choose your spaceship weapon:"), 50);
        System.out.println("1. Cosmic Missile Launcher");
        System.out.println("2. Nanobot Lasers");
        int weaponChoice = Tools.getUserInput(1, 2);
        System.out.println();

        //User finishing building their spaceship
        Tools.typeWriterVariables(("You've built your spaceship"), 50);
        System.out.println();
        // Proceed to liftoff method
        liftOff(); 
    }//end of shipBuilding

    //a method that showcasing a countdown for liftoff
    public static void liftOff() {
        System.out.println("Getting ready for lift off...");
        for (int i = 10; i > 0; i--) {
            System.out.println(i + "!");
            Tools.pause(1000);
        }//end of for loop
        System.out.println("Take Off!");
        System.out.println();
        Tools.typeWriterVariables(("You pass Ogygia's atmosphere and into space towards Ithnca"), 50);
        Tools.pause(1000);
    }//end of liftOff
}//end of journeyHome