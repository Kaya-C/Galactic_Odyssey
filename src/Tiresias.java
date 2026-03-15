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

//A Class representing the encounter with Tiresias and receiving a prophecy
public class Tiresias {
    //Reveals the user's future through a prophecy
    public static void yourFuture() {
        System.out.println();
        //Tells you who Tiresias is 
        Tools.typeWriterVariables(("Tiresias is a blind prophet who can 'see' one's future through his Cybernetic powers"), 50);
        Tools.typeWriterVariables(("You find him deciphering quantum currents and ask for his help"), 50);
        Tools.typeWriterVariables(("'Time does not flow in a straight line,' Tiresias declares, 'for you experience the past, present, and future interchangeable'"), 50);

        //Scanner
        Scanner h = new Scanner(System.in);
        //Game Prompt
        System.out.print("Press Enter to Hear the Prophecy.");
        h.nextLine();

        //Display the prophecy by reading it from a file
        Tools.typeWriterVariables(("Then in a solemn tone, Tiresias tells a prophecy: "), 50);
        System.out.println();
        System.out.println();
        File prophecy = new File("Prophecy.txt");
        Tools.typeWriterFiles(prophecy, 45);
    }//end of yourFuture
}//end of Tiresias class