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

//the class that tells user's life afterwards
public class KingOfIthaca {
    //a method to ask a question
    public static void theQuestion() {
        //scanner
        Scanner i = new Scanner(System.in);
        //a loop that asks a questions with only one correct answer
        while (true) {
            System.out.println();
            System.out.print("Penelope: ");
            System.out.println("Are You Truly My Husband?");
            System.out.print("You: ");
            String answer = i.nextLine();

            //check to see if the answer is "Yes"
            if (answer.equalsIgnoreCase("Yes")) {
                //exit the loop if the answer is "Yes"
                break; 
            }//end of if
            else {
                while (true) {
                    System.out.print("Are you sure? ");
                    String answer2 = i.nextLine();
                    if (answer2.equalsIgnoreCase("No")) {
                        // Break out of the inner loop if the answer is "No"
                        break; 
                    }//end of if
                    else {
                        //Repeats the loop
                        System.out.println("No, you're not.");
                    }//end of else
                }//end of while
            }//end of else
        }//end of while loop
        
        
        //once the player finally answers Yes, it displays a file called "Life.txt"
        File yourLife = new File("Life.txt");
        Tools.typeWriterFiles(yourLife, 50);
    }//end of theQuestion
}//end of KingOfIthaca