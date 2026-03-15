/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use input and scan files
import java.util.*;
//allows the program to use files, print into file, and the FileNotFoundException
import java.io.*;

// A class representing events and battle involving the robot, Polyphemus 
public class Polyphemus {
    
    //an global object from the Enemies sub class that is a extends the abstract class Character. Initialize it too
    static Enemies polyphemus = new Enemies("Polyphemus", 200, -150);

    //Array of player actions
    static String[] actionLetter = {"j", "d", "l", "r", " "};
    
    // global scanner
    static Scanner a = new Scanner(System.in);
    
    static int max = 4;
    static int min = 0;

    //global object
    static Odysseus mc;

    //a method that shows the background and encounter with Polyphemus - - passes the object mc from main class
    public static void background(Odysseus passmc) {
        //The object is passed to the global variable
        mc = passmc;
        File start = new File("PolyphemusStart.txt");
        //passes the file to be typewrited
        Tools.typeWriterFiles(start, 50);
        //start game method
        startGame();
    }// end of background

    //a game for the battle
    public static void startGame() {
        //controls for the game
        Tools.typeWriterVariables(("Controls:"), 50);
        System.out.println("- Jump = 'j'");
        System.out.println("- Dunk = 'd'");
        System.out.println("- Left = 'l'");
        System.out.println("- Right = 'r'");
        System.out.println("- Attack = 'space bar'");
        System.out.println();
        //continue prompt 
        System.out.print("Press Enter to Start the Game!");
        a.nextLine();

        int round = 0;
        //loop that keeps going until you or the rounds = 15
        while (true) {
            //a random action that Polyphemus does and you need to do
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            //method to call the action forward
            actions(randomNumber);
            //if your health is zero you die, and the Death class is called
            if ((mc.getHealth()) <= 0) {
                //Death.demise(mc);
            }// end of if

            //if round = 15
            if (round == 15) {
                //Tne ending of the battle 
                File end = new File("PolyphemusEnd.txt");
                Tools.typeWriterFiles(end, 50);
                //gives you the choice to kill or spare - influences your morality and wisdom
                System.out.println("1. Kill Polyphemus");
                System.out.println("2. Spare Polyphemus");
                int option = Tools.getUserInput(1, 2);
                if (option == 1) {
                    Tools.typeWriterVariables(("Filled with rage, you throw a plasma grenade inside the cave, blowing the entire thing up"), 50);
                    mc.changeMorality(-3);
                    mc.changeWisdom(2);
                } else {
                    Tools.typeWriterVariables(("Grief-stricken, you decide to show mercy and leave"), 50);
                    mc.setMorality(3);
                }
                break;
            }

            //6 times, a crewmate dies
            if (round == 2 || round == 5 || round == 7 || round == 8 || round == 11 || round == 13) {
                Tools.pause(100);
                if (round == 2) {
                    System.out.println("A member of your crew has fallen");
                    SpaceShip.setCrewmates(-1);
                } else {
                    System.out.println("Another member of your crew has fallen");
                    SpaceShip.setCrewmates(-1);
                }// end of else
            }// end of if
            round++;
        }// end of while
    }// end of main

    //a method to perform a counter move to Polyphemus' action 
    public static void actions(int number) {
        System.out.println();

        // Display the action based on the random number
        if (number == 0) {
            System.out.print("Jump! ");
        } else if (number == 1) {
            System.out.print("Dunk! ");
        } else if (number == 2) {
            System.out.print("Move to the Left. ");
        } else if (number == 3) {
            System.out.print("Move to the Right. ");
        } else {
            System.out.print("Attack! ");
        }

        // Get the user's move
        String userMove = a.nextLine();
        System.out.println();
        // Check the user's input
        checkActions(userMove, number);
    }// end of actions()

    // checks to see what the user put in
    public static void checkActions(String userMove, int actionNumber) {
        if ((userMove.equalsIgnoreCase(actionLetter[actionNumber])) && (actionNumber != 4)) {
            System.out.println("You managed to dodge Polyphemus' attack");
            System.out.println();
            System.out.println(" + 10 Health");
            mc.changeHealth(10);
        }// end of if
        else if ((userMove.equalsIgnoreCase(actionLetter[actionNumber])) && (actionNumber == 4)) {
            int randomNumber2 = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("You managed to hit Polyphemus");
            System.out.println();
            
            if (randomNumber2 >= 2 && randomNumber2 <= 0) {
                System.out.println("- 35 Polyphemus' Health");
                polyphemus.changeHealth(-35);
            }// end of if
            
            else if ((randomNumber2 == 3)) {
                System.out.println("Polyphemus blocked the attack and did a counter-attack");
                System.out.println("- 10 Health");
                mc.changeHealth(-10);
                
            }// end of else if
            else {
                System.out.println("Crucial strike");
                System.out.println("- 50 Polyphemus' Health");
                polyphemus.changeHealth(-50);
            }// end of else
        } 
        else if ((!userMove.equalsIgnoreCase(actionLetter[actionNumber])) && (actionNumber == 4)) {
            System.out.println("You failed to attack Polyphemus in time resulting in him kicking you away");
            System.out.println();
            System.out.println("- 15 Health");
            mc.changeHealth(-15);
        }// end of else if
        else {
            System.out.println("You failed to dodge Polyphemus' Iron Club");
            System.out.println();
            System.out.println("- 25 Health");
            mc.changeHealth(-25);
        }// end of else
        System.out.println();
        mc.displayStatus();
        polyphemus.displayStatus();
    }// end of checkActions()
}// end of Polyphemis