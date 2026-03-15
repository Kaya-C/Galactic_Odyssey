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

public class Calypso {
    // Method to describe the encounter with a black hole
    public static void blackHole() {
        // Introduce the narrative with typewriter effect
        Tools.typeWriterVariables(("If it wasn't bad enough, the space pod relied on the cosmic currents, the domain of Poseidon. "), 50);
        Tools.typeWriterVariables(("With limited strength left and injuries, you find yourself helpless as your mini ship is propelled across the empty void—perhaps a bit too empty"), 50);
        Tools.typeWriterVariables(("But then, you see a strange glow around an invisible source."), 50);
        System.out.println();
        System.out.println();
        Tools.pause(1000);

        // Display ASCII art of a Black Hole
        File blackHole = new File("BlackHole.txt");
        printFiles(blackHole);

        System.out.println();
        System.out.println();
        Tools.typeWriterVariables(("A Black Hole."), 150);
        System.out.println();

        // Move all the content from descriptionBlack Hole file into an array
        File description = new File("DescriptionBlackHole.txt");
        String[] array = new String[13];
        try {
            Scanner sc = new Scanner(description);
            int i = 0;
            // Read each line from the file and store it in the array
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                array[i] = line;
                if (i == 13) {
                    break;
                }//end of if
                i++;
            }//end of while
        }//end of try 
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }//end of catch

        // Display each charcter of each index of the array as random colors
        for (int i = 0; i < 13; i++) {
            colourText(array[i]);
        }//end of for loop

        //clear the console
        Tools.clearConsole(1000);
        Tools.pause(2500);
        //display information from a file
        File help = new File("HermesHelp.txt");
        Tools.typeWriterFiles(help, 50);
    }//end of blackHole

    // Method to color each char of a text passed with random colors
    public static void colourText(String text) {
        for (int i = 0; i < text.length(); i++) {
            int max = 97;
            int min = 90;
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            char index = text.charAt(i);
            //generates a random ANSI color code
            String colorCode = ("\u001B[" + randomNumber + "m");
            String resetCode = "\u001B[0m";

            // Print the char with a random color
            System.out.print(colorCode + index + resetCode);

            try {
                Thread.sleep(50);
            }//end of try
            catch (InterruptedException e) {
                System.out.println("Exception " + e);
            }//end of catch
        }//end of for loop
        System.out.println();
    }//end of colourText

    //prints the contents of a file
    public static void printFiles(File file) {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }//while loop
        }//end of try
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }//end of catch
    }//end of printFiles()
}//end of Calypso