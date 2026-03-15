/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use input and scan files
import java.util.*;

//The class representing Charybdis
public class Charybdis {
    static int space = 5; // Size of the space
    static int playerX = 0; // Player's X-coordinate
    static int playerY = 0; // Player's Y-coordinate

    //global object
    static Odysseus mc;

    //Charybdis' encounter - mc object is passed from main class
    public static void spaceStorm(Odysseus passmc) {
        //global object is updated to passed object
        mc = passmc;
        //scanner
        Scanner k = new Scanner(System.in);

        //display controls
        Tools.typeWriterVariables(("Controls:"), 50);
        System.out.println("Left - 'A'");
        System.out.println("Right - 'D'");
        System.out.println("Up - 'W'");
        System.out.println("Down - 'S'");
        System.out.println();
        //game prompt
        System.out.print("Press Enter to Start the Game!");
        k.nextLine();
        System.out.println();

        //Game loop
        while (true) {
            //check ship health
            checkShipHealth(); 
            //display the Space
            displaySpace(); 

            //users's move input
            while (true) {
                System.out.print("Enter your move (W/A/S/D): ");
                String move = k.nextLine();

                // checks and acts based on player's move
                if (move.equalsIgnoreCase("W")) {
                    moveUp();
                    break;
                } 
                else if (move.equalsIgnoreCase("S")) {
                    moveDown();
                    break;
                } 
                else if (move.equalsIgnoreCase("A")) {
                    moveLeft();
                    break;
                } 
                else if (move.equalsIgnoreCase("D")) {
                    moveRight();
                    break;
                } 
                else {
                    System.out.println("Invalid move.");
                }//end of else
            }//end of while

            vortex(); //check to see if the player encounters a vortex

            //check to if the player reached the end 
            if (playerX == 4 && playerY == 4) {
                //display the Space
                displaySpace();
                Tools.typeWriterVariables(("You escaped Charybdis"), 50);
                break;
            }//end of if
        }//end of while
    }//end of main method

    //a method that displays the Space
    public static void displaySpace() {
        System.out.println("Current Ship Position: (" + playerX + ", " + playerY + ")");
        System.out.println();
        System.out.println("   0  1  2  3  4");
        for (int i = 0; i < space; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < space; j++) {
                // Display the player's position
                if (i == playerY && j == playerX) {
                    System.out.print("🚀  ");
                } 
                else {
                    System.out.print(" - ");
                }//end of else

                //Display the end goal
                if (i == 4 && j == 4) {
                    System.out.println("⭐");
                }//end of if
            }//end of for
            System.out.println();
        }//end of for loop
    }//end of displaySpace()

    //a method to check if the user encountered a vortex
    public static void vortex() {
        if ((playerX == 1 && playerY == 1) || (playerX == 0 && playerY == 3) || (playerX == 1 && playerY == 4)
                || (playerX == 3 && playerY == 2) || (playerX == 3 && playerY == 4) || (playerX == 4 && playerY == 1)) {
            System.out.println("You got caught in one of Charybdis' space vortex 🌀 ");
            System.out.println("- 20 Ship Health");
            SpaceShip.setShipHealth(-50);
            System.out.println("Space Ship Health: " + (SpaceShip.getShipHealth()));
        }//end of if
        System.out.println();
    }//end of vortex

    //a method to check if the ship health is zero or less and says you died if it is
    public static void checkShipHealth() {
        if ((SpaceShip.getShipHealth()) <= 0) {
            Tools.typeWriterVariables(("Your ship became too damaged and got caught in Charybdis' whirlpool"), 50);
            //Death.demise(mc);
        }//end of if
    }//end of checkShipHealth()

    //All the methods to move the player in different directions
    
    public static void moveUp() {
        if (playerY > 0) {
            playerY--;
        }//end of if 
        else {
            System.out.println("You can't move up.");
        }//end of else
    }//end of moveUp()

    public static void moveDown() {
        if (playerY < space - 1) {
            playerY++;
        }//end of if  
        else {
            System.out.println("You can't move down. ");
        }//end of else
    }//end of moveDown()

    public static void moveLeft() {
        if (playerX > 0) {
            playerX--;
        }//end of if 
        else {
            System.out.println("You can't move left.");
        }//end of else
    }//end of moveLeft()

    public static void moveRight() {
        if (playerX < space - 1) {
            playerX++;
        }//end of if
        else {
            System.out.println("You can't move right. ");
        }//end of else
    }//end of moveRight()
}//end of Charybdis class