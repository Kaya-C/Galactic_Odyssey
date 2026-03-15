/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use input and scan files
import java.util.*;
//allows the program to use Array methods
import java.util.Arrays;

//A class for the encounter with the Lotus simulation - a memory cards game
public class Lotus {
    //array for the unflipped cards
    static String[] yourCards = {"🟦", "🟦", "🟦", "🟦", "🟦", "🟦", "🟦", "🟦"};

    //array for the flipped memory cards 
    static String[] flippedCards = {"🤖", "🌌", "🤖", "🚀", "🎯", "🎯", "🌌", "🚀"};

    //time remaining to escape the Lotus Simulation
    static int timeLeft = 20;
    
    // global scanner
    static Scanner y = new Scanner(System.in);

    // The introduction to the simulation and how to escape it
    public static void simulation(Odysseus mc) {
        Tools.typeWriterVariables(("Your crew is tired so you stop by the Planet of Meninx, home to the Lotus Eaters"), 50);
        Tools.typeWriterVariables(("A planet once said to be filled with Lotus Flowers that makes you forget your worries and your memories. A blissful experience under your mind shuts down. Luckily, they have been extinct for millennia"), 50);
        Tools.typeWriterVariables(("However, upon entering Meninx, you notice the planet seems almost too perfect."), 50);
        Tools.pause(2500);
        Tools.typeWriterVariables(("Welcome to the Lotus Simulation where you are happy forever without any of the work needed."), 50);
        
        // Warns the player about the dangers of the simulation
        Tools.typeWriterVariables(("Oh no... Escape the Lotus Simulation before your mind completely stumbles and shuts down."), 50);
        
        //Start prompt 
        System.out.print("Press Enter to Start the Game");
        y.nextLine(); 
        System.out.println();
        
        Tools.typeWriterVariables(("Try to regain control of your mind with a memory cards game."), 50);
        
        //Loop for game
        while (true) {
            //display the time remaining and the memory cards
            System.out.println("Time left: " +  timeLeft + " Seconds");
            printFlippedArrays(-1, -1);
            System.out.println();

            //asks the user to flip two cards
            System.out.print("Enter the index of the first card you would like to flip: ");
            int index1 = Tools.getUserInput(0, 7);
    
            printFlippedArrays(index1, -1);
            System.out.print("Enter the index of the second card you would like to flip: ");
            int index2 = Tools.getUserInput(0, 7);
            
            //the selected cards is flipped and checked for matches
            flipCards(index1, index2);
            
            //if the time has run out, you die
            if (timeLeft == 0) {
                Tools.typeWriterVariables(("You failed to escape the simulation"), 50);
                //Death.demise(mc);
                break;
            }

            //check if all cards have been matched by comparing the two arrays
            if (Arrays.equals(yourCards, flippedCards)) {
                Tools.typeWriterVariables(("You escape the simulation and free your crewmates too"), 50);
                Tools.typeWriterVariables(("You quickly leave Meninx"), 50);
                break;
            }
        }//while
    }//end of simulation

    //Displays the unflipped memory cards
    public static void print1DArrays() {
        System.out.println();
        System.out.println(" 0  1  2  3  4  5  6  7");
        for (int i = 0; i < yourCards.length; i++) {
            System.out.print(yourCards[i] + "  ");
        }//end of for loop
    }//end of print1DArrays

    //a method to flip selected cards and check for matches
    public static void flipCards(int index1, int index2) {
        System.out.println();
        printFlippedArrays(index1, index2);
        //if the cards number were the same
        if (index1 == index2) {
            System.out.println("You entered the same index.");
        } 
        // Check if the second selected card does not form a matching pair
        else if (!flippedCards[index1].equals(flippedCards[index2])) {
            System.out.println("Not a match.");
        } 
        //else matching pair is found
        else {
            System.out.println("Match found!");
            //Updates the unflipped cards
            yourCards[index1] = flippedCards[index1];
            yourCards[index2] = flippedCards[index2];
        }//end of else
        
        // Shows one second has passed 
        System.out.println();
        System.out.println("- 1 Second");
        System.out.println();
        timeLeft = timeLeft - 1;
    }//end of flipCards()

    //prints the memory cards
    public static void printFlippedArrays(int index1, int index2) {
        System.out.println();
        System.out.println(" 0  1  2  3  4  5  6  7");
        for (int i = 0; i < yourCards.length; i++) {
            //displays the first flipped card
            if (i == index1 && index2 < 0) {
                System.out.print(flippedCards[i] + "  ");
            } 
            //displays both flipped cards
            else if (i == index1 || i == index2) {
                System.out.print(flippedCards[i] + "  ");
            } 
            else {
                System.out.print(yourCards[i] + "  ");
            }//end of else
        }//end of for loop
        System.out.println();
        System.out.println();
    }//end of printFlippedArrays
}//end of Lotus