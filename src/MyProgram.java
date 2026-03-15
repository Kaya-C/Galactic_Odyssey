/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task

This program is an Odyssey inspired game but as a space reimaging. You play as Odysseus who is 
trying to get home and must travel through space. It is a game that consists of many mini games 
that tells the story of his journey home. 
*/

//allows the program to use input and scan files
import java.util.*;

//Main Class
public class MyProgram{
    //global scanner
    static Scanner misc = new Scanner(System.in);
    
    //an global object from the Odysseus sub class that is a extends the abstract class Character. Initialize it too
    static Odysseus mc = new Odysseus("Odysseus", 100, 0, 10);
    
    /*
    Tools.typeWriterVariables(String, int) and Tools.typeWriterFiles(File, int) are the two methods found under the Tools Class - It prints out text found either in Variables or Files like a typewritier. It is used in almost all classes. 
    
    Also found under the Tools class is Tools.pause(int), Tools.clearConsole(time), Tools.dots(int) and Tools.getUserInput(int, int). The pause method delays the program by (int x). The clearConsole clears the console and the dots method is used to displaying "printing dots". The getUserInput is used to get user input and checks to see if its a integer and if its in the range.
        They all are used in almost all classes.
    */
    
    //Main method
    public static void main(String[] args){
        //Introduction
        Tools.typeWriterVariables(("Galactic Odyssey"), 100);
        Tools.clearConsole(2500);
        Tools.typeWriterVariables(("After 10 long years, the Achaean Legion emerges victorious in the cosmic war against the Trojan Nebula."), 50);
        System.out.println();
        Tools.typeWriterVariables(("You, Odysseus, king of Ithaca, brilliant strategist, and Spaceship Captain, are in charge of 12 spaceships and bringing 600 humans, cyborgs, and other beings back home."), 50);
        
        //SpaceShip is a class and here it is initializing how many crewmates and the health of the ship
        SpaceShip.setCrewmates(600);
        SpaceShip.setShipHealth(1000);
    
        System.out.println();
        
        //Start prompt
        System.out.print("Press Enter to Start the Game!");
        misc.nextLine();
        
        System.out.println();

        Tools.clearConsole(100);
        
        //The journey begins with the game from the Cicones class where you make decisions on what to do - passes the mc object
        Cicones.startJourney(mc);
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //The second game from the Lotus class where you play a memory game is excape - passes the mc object
        Lotus.simulation(mc);
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //The third game from the Polyphemus class whee you fight a gaint robot- passes the mc object
        Polyphemus.background(mc);
        Tools.typeWriterVariables(("You are able to leave Sicily's atmosphere and return to the Mothership, The Homer 1200"), 50);
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //The fourth game from the Aeolus class where you ask riddles - passes the mc object
        Aeolus.riddles(mc);
        //changes the mc health to 100
        mc.setHealth(100);
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //The Story line continues
        Tools.typeWriterVariables(("Propelled by the Astral Winds, you successfully arrived at the Greek Galaxy with home just on the horizon."), 50);
        Tools.typeWriterVariables(("With home so close, you find yourself drifting off into dreams of future memories....."), 50);
        
        //Program is paused for 1 sec
        Tools.pause(1000);
        
        //The Story line continues
        Tools.typeWriterVariables(("A resounding whooshing sound jolts you awake, and as you open your eyes, you discover your windbag missing and in the hands of some of your crewmates - opened."), 50);
        Tools.typeWriterVariables(("The powerful energy released from the bag creates a gravitational anomaly, forming a wormhole that drags your entire fleet in and hurls you beyond the galaxy."), 50);
        
        //The Console is cleared
        Tools.clearConsole(100);
        
        //The fifth game from the Laestrygones class where you defend yourself and attack (tower defense) - passes the mc object
        Laestrygones.shipDefense(mc);
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //The Story line continues
        Tools.typeWriterVariables(("As you depart the Telepylos Cluster, the heavy weight of loss lingers, with only 43 crewmates left by your side."), 50);
        Tools.typeWriterVariables(("But, a flicker of hope remains as you set course, determined to finally reach home alive this time with your ENTIRE remaining crew at all cost.."), 50);
        
        //Calls the a method that asks if you want to repair the ship
        repairShip();
        
        //The sixth game from the Circe class where you have to save your crewmates and solve a puzzle - passes the mc object
        Circe.expedition(mc);
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //Program is paused for 2 second
        Tools.pause(2000);
        
        //The seventh game from the Tiresias class where you hear your future - passes the mc object
        Tiresias.yourFuture();
        
        //Program is paused for 5 second
        Tools.pause(5000);
        
        //The Story line continues
        Tools.typeWriterVariables(("You leave the Under Dimension and continue on your journey with a grim future ahead it seems..."), 50);
        
        //Console is cleared
        Tools.clearConsole(100);
        
        //The eighth game from the Tiresias class where you pass by the sirens - passes the mc object
        Sirens.song(mc);
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //The ninth game from the Lesserof2evils class where you can choose to pass by one of the two - passes the mc object
        Lesserof2evils.choose(mc);
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //Calls the a method that asks if you want to repair the ship
        repairShip();
        
        //The tenth game from the HeliosCattle class where you can choose to eat or not eat the cattle 
        HeliosCattle.cattleHerds(mc);
        //displays the game status - health, crewmates etc.
        mc.displayStatus();

        //The eleventh game from the Calypso class where you are in a black hole 
        Calypso.blackHole();
        
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //The twelfth game where you build a ship to reach home 
        JourneyHome.shipBuilding();
        //changes the mc health to 100
        mc.setHealth(100);
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //The thirtieth game where you fight to reclaim your throne 
        YourThrone.competition();
        //displays the game status - health, crewmates etc.
        mc.displayStatus();
        
        //The class that prints out the ending  
        KingOfIthaca.theQuestion();
    
    }//end of main
    
    //a method that allows the user to fix their spaceship
    public static void repairShip(){
        //use wisdom points gained thorughout the journey to fix the ship
        System.out.println("You have " + mc.getWisdom() + " Wisdom Points");
        Tools.typeWriterVariables(("You have Wisdom Points)"), 50);
        Tools.typeWriterVariables(("Use it to repair the ship (1 point = 25 health)"), 50);
        //asks if the user want to interchange them
        System.out.println("1. Yes");
        System.out.println("2. No");

        int repair = Tools.getUserInput(1, 2);
        //if yes, the ship is fixed by depeding on how much poinits they have
        if (repair == 1){
            System.out.println("How much points would you like to use: ");
            int points = Tools.getUserInput(0, (mc.getWisdom()));
            mc.changeWisdom((-points));
            SpaceShip.setShipHealth((repair * 25));
        }//end of if
        Tools.clearConsole(100);
    }//end of repairShip();
}//end of MyProgram