/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use input and scan files
import java.util.*;

//A class showing the battle with the Laestrygones - tower defense inspiried game
public class Laestrygones {
    
    //an global object from the Enemies sub class that is a extends the abstract class Character. Initialize it too
    static Enemies laestrygones = new Enemies("Laestrygones", 1500, -500);

    //the number of available ships for the user
    public static int fighterShips = 4;
    public static int cruiserShips = 5;
    public static int bomberShips = 2;
    public static int mothership = 1;
    
    //global variable for the ship selected by the user
    public static int ship;

    //global scanner
    static Scanner e = new Scanner(System.in);

    //ship defense against the Laestrygones - passes the object mc from main class
    public static void shipDefense(Odysseus mc){
        //encounter
        Tools.typeWriterVariables(("Oh no! The wormhole has dropped you into the treacherous Telepylos Cluster, home to the Galactic Giants known as the Laestrygones."), 50);
        System.out.println();
        Tools.typeWriterVariables(("Residing among the massive asteroids, they are far from the friendly type of aliens."), 50);
        System.out.println();
        Tools.typeWriterVariables(("Prepare to defend the Mothership and survive in this daunting corner of space."), 100);
        //game prompt
        System.out.print("Press Enter to Start the Game!");
        e.nextLine();
        System.out.println();
        
        //the instructions for the game
        Tools.typeWriterVariables(("Ship Defense! The goal is to protect the Mothership (1) and defeat the Laestrygones"), 50);
        System.out.println();
        System.out.println("You can attack or defend with these ships: ");
        System.out.println(" - Fighter ships (4 ships) have a damage scale of 100");
        System.out.println(" - Cruiser ships (5) can be used to protect the Mothership");
        System.out.println(" - Bomber ships (2) have a damage scale of 150");

        //Game loop as long as your ship health is less than zero or the Laestrygones's health
        while ((SpaceShip.getShipHealth()) > 0 && (laestrygones.getHealth()) > 0) {
            System.out.println();
            //method to display health
            displayHealths();
            System.out.println();
            //methods to display your ships left and place them
            displayShips();
            placeShip();
            System.out.println();
            //a method that generates a random attack from the Laestrygones
            laestrygonesAttack();
        }//end of while
        //the result of the game - passes the mc object
        displayResult(mc);
    }//end of shipDefense()

    //displays the remaining ships
    public static void displayShips() {
        System.out.println("Fighter ships left: " + fighterShips);
        System.out.println("Cruiser ships left: " + cruiserShips);
        System.out.println("Bomber ships left: " + bomberShips);
        System.out.println();
    }//end of displayShips

    //display the health of the Mothership and Laestrygones
    public static void displayHealths() {
        System.out.println();
        System.out.println("Spaceship Health: " + (SpaceShip.getShipHealth()));
        laestrygones.displayStatus();
    }//end of displayHealths

    //placing a ship based on user input
    public static void placeShip() {
        while (true) {
            System.out.println("Place your ship! (1. Fighter, 2. Cruiser, 3. Bomber)");
            ship = Tools.getUserInput(1, 3);
            System.out.println();
            //calls on the ship method based on user input and availability of the ship
            if (ship == 1 && fighterShips > 0) {
                fighter();
                break;
            } 
            else if (ship == 2 && cruiserShips > 0) {
                cruiser();
                break;
            } 
            else if (ship == 3 && bomberShips > 0) {
                bomber();
                break;
            } 
            else {
                System.out.println("Ship no longer found.");
            }//end of else
        }//end of while
    }//end of placeShip

    //fighter ship
    public static void fighter() {
        Tools.typeWriterVariables(("A Fighter Ship has dealt 100 damage to Laestrygones!"), 50);
        laestrygones.changeHealth(-100);
    }//end of fighter

    //cruiser ship 
    public static void cruiser() {
        Tools.typeWriterVariables(("A Cruiser Ship has been stationed in front of the Mothership!"), 50);
    }//end of cruiser

    //bomber ship 
    public static void bomber() {
        Tools.typeWriterVariables(("A Bomber Ship has dealt 150 damage to Laestrygones!"), 50);
        laestrygones.changeHealth(-150);
    }//end of bomer

    //The Laestrygones' attack
    public static void laestrygonesAttack() {
        Tools.typeWriterVariables(("The Laestrygones started attacking!"), 50);
        System.out.println();
        int max = 5; 
        int min = 1; 
        int randomNumber = (int)(Math.random() * (max - min + 1) + min); 
        
        // Attack based on a random number
        if (randomNumber == 1 && fighterShips > 0) {
            Tools.typeWriterVariables(("The Laestrygones hit a Fighter ship and destroyed it!"), 50);
            fighterShips = fighterShips - 1 ;
        }//end of if
        else if (randomNumber == 2 && bomberShips > 0) {
            Tools.typeWriterVariables(("The Laestrygones hit a Bomber ship and destroyed it!"), 50);
            bomberShips = bomberShips - 1 ;
        }//end of else if
        else if ((randomNumber == 3 || randomNumber == 4)) {
            Tools.typeWriterVariables(("The Laestrygones missed!"), 50);
        }//end of else if
        else {
            //Checks to see if the user placed a cruiser ship
            if (ship == 2) {
                Tools.typeWriterVariables(("The Cruiser Ship has been destroyed, protecting the Mothership!"), 50);
                cruiserShips = cruiserShips - 1;
            }//end of if
            else {
                Tools.typeWriterVariables(("The Mothership has been hit!"), 50);
                System.out.println("- 100 Ship Health");
                SpaceShip.setShipHealth(-100);
            }//end of else
        }//end of else
    }//end of laestrygonesAttack()

    //Display the result of the game
    public static void displayResult(Odysseus mc) {
        System.out.println("Game Over!");
        System.out.println();
        if ((SpaceShip.getShipHealth()) <= 0) {
            Tools.typeWriterVariables(("The Mother Ship has been destroyed. You lose!"), 50);
            //Death.demise(mc);
        }//end of if
        else {
            Tools.typeWriterVariables(("Congratulations! You've defeated the Laestrygones!"), 50);
            Tools.pause(200);
            Tools.typeWriterVariables(("But wait—"), 50);
            Tools.pause(250);
            Tools.typeWriterVariables(("In a last-ditch effort for revenge, the Laestrygones unleashed a series of nano-bombs at your fleet"), 50);
            Tools.typeWriterVariables(("In the end, the Laestrygones ultimately won, having obliterated 11 out of your 12 ships and claiming the lives of 550 out of 600 people, leaving only the Mothership and 44 mates including you alive."), 75);
            SpaceShip.setCrewmates(-550);
        }//end of else
    }//end of displayResult()
}//end of Laestrygones class