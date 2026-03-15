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

//A Class for the interaction with Aeolus and answering his riddle
public class Aeolus {
    
    //global scanner
    static Scanner q = new Scanner(System.in);

    //global object
    static Odysseus mc;

    //Displays the riddles of Aeolus - passes the object mc from Main class
    public static void riddles(Odysseus passmc) {
        //The object is passed to the global variable
        mc = passmc;
        
        //Gets Aeolus speech from file and typewrites it
        File aeolus = new File("AeolusInteraction.txt");
        Tools.typeWriterFiles(aeolus, 50);
        
        System.out.println();
        //lets the user choose the level ofdifficulty of the riddle
        System.out.println("Choose a 1. Easy, 2. Medium, 3. Hard Riddle");
        int riddleDifficulty = Tools.getUserInput(1, 3);
        
        //The riddles
        if (riddleDifficulty == 1) {
            Tools.typeWriterVariables(("I'm not a planet, nor a star so bright,"), 50);
            Tools.typeWriterVariables(("Yet in the night, I shine with light."), 50);
            Tools.typeWriterVariables(("I travel the sky, a celestial wanderer,"), 50);
            Tools.typeWriterVariables(("Leaving a fiery tail, a cosmic blur."), 50);
            //calls a method to get answer but also passes the answer, and two clues
            getRiddleAnswer(1, "Comet", "Halley's _____  ☄", "Co - - t");
        }//end of if 
        else if (riddleDifficulty == 2) {
            Tools.typeWriterVariables(("A goddess of wisdom, strong and bright,"), 50);
            Tools.typeWriterVariables(("Born in armor, a formidable sight."), 50);
            Tools.typeWriterVariables(("Olympus' scholar, in battles a guide,"), 50);
            Tools.typeWriterVariables(("Who am I, with wisdom as my pride?"), 50);
            //calls a method to get answer but also passes the answer, and two clues
            getRiddleAnswer(2, "Athena", "Patron of Athens 🦉", "Athe - -");
        }//end of else if
        else {
            Tools.typeWriterVariables(("In the night sky, a hunter's grace,"), 50);
            Tools.typeWriterVariables(("A mythic beast with stars to trace."), 50);
            Tools.typeWriterVariables(("Bow in hand, it claims its place,"), 50);
            Tools.typeWriterVariables(("A constellation in the cosmic space."), 50);
            //calls a method to get answer but also passes the answer, and two clues
            getRiddleAnswer(3, "Orion", "A constellation in the sky that looks like a hunter 🏹", "O - ion");
        }//end of else
    }//end of riddles()

    //A method to get answer and gives hints 
    public static void getRiddleAnswer(int riddleNumber, String answer, String clue1, String clue2) {  
        System.out.println();
        int clues = 3;
        int rounds = 0;

        //A loop to get user input and check the answer
        while (true) {
            System.out.print("Answer: ");
            String input = q.nextLine();
            System.out.println();
            System.out.print("Aeolus: ");

            //checks to see if the user's answer is correct and breaks loop
            if (input.equalsIgnoreCase(answer)) {
                Tools.typeWriterVariables(("You got it!"), 50);
                //a method called to reward the user 
                gift(riddleNumber);
                break;
            } 
            //if the User's answer is incorrect - the loop continue
            else {
                Tools.typeWriterVariables(("Nope!"), 50);
                System.out.println();
                rounds++;

                //gives hint after 5 rounds
                if (rounds == 5) {
                    System.out.println();
                    System.out.print("Aeolus: ");
                    Tools.typeWriterVariables(("Would you like a hint (Yes/No)?"), 50);
                    String clueWanted = q.nextLine();
                    
                    if (clueWanted.equalsIgnoreCase("Yes")) {
                        System.out.print("Clue: ");
                        Tools.typeWriterVariables((clue1), 50);
                    }
                } 
                //gives hint after 10 rounds
                else if (rounds == 10) {
                    System.out.print("Aeolus: ");
                    Tools.typeWriterVariables(("Would you like another hint (Yes/No)?"), 50);
                    String anotherClueWanted = q.nextLine();
                    
                    // Display the second clue if the user wants it
                    if (anotherClueWanted.equalsIgnoreCase("Yes")) {
                        System.out.print("Clue: ");
                        Tools.typeWriterVariables((clue2), 50);
                    }//emd of if
                }//end of else if
            }//end of else
        }//end of while loop
    }//end of getRiddleAnswer

    //Rewards the user for solving a riddle (based on level)
    public static void gift(int number) {
        //user's wisdom is increased based on the riddle difficulty
        mc.changeWisdom((number * 5));
        System.out.print("Aeolus: ");
        Tools.typeWriterVariables(("As promised, here is your prize, a bag filled with Astral Winds that would help you get home fast. BUT, you must NEVER open it"), 50);
        Tools.pause(100);
        Tools.typeWriterVariables(("Curiosity sparks between your crewmates as they ask about what's in the bag. Remembering Aeolus' warning, you rebuke their questions and securely keep the bag beside you."), 50);
    }//end of gift
}//end of Aeolus