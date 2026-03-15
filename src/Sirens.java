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

// Class showcasing the encounter with the Sirens
public class Sirens {
    //A method to make a choice to hear the Sirens' song or not - passes the mc object from the main class
    public static void song(Odysseus mc){
        //Who are the sirens and what do they do
        Tools.typeWriterVariables(("Sirens are ancient creatures from the seas of Earth who evolved to be monsters of space"), 50);
        Tools.typeWriterVariables(("The Anthemoessa void is a region of space where the sound of Sirens defies the laws of physics and lures you to your death with their song"), 50);
        Tools.typeWriterVariables(("You must journey through the Sirens' void to reach Ithaca"), 50);
        System.out.println();
        Tools.typeWriterVariables(("Luckily, your spaceship has soundproof headphones and your crew can tie you up if you want to hear the song"), 50);
        System.out.println();
        Tools.typeWriterVariables(("Would you like to hear the Siren's song said to sing your greatest desires"), 50);
        //allows the user to make the choice to listen to the song or not
        System.out.println("1. Yes");
        System.out.println("2. No");
        int hearSong = Tools.getUserInput(1, 2);
        
        //user hears the Siren's song
        if (hearSong == 1){
            System.out.println();
            Tools.typeWriterVariables(("As you pass through the Anthemoessa void, you hear several eerie voices singing, asking you to leave your ship and they would fulfill your wishes: "), 50);
            System.out.println();
            File song = new File("SirensSong.txt");
            //display the Siren's song from a file
            Tools.typeWriterFiles(song, 75);
            System.out.println();
            Tools.typeWriterVariables(("Do you cut the ropes and exit the spaceship?"), 50);
            //Gives the choice to the user if they want to leave the spaceship
            System.out.println("1. Yes");
            System.out.println("2. No");
            
            int leave = Tools.getUserInput(1, 2);
            System.out.println();
            if (leave == 1){
                //If they leave, they die
                Tools.typeWriterVariables(("You were tricked"), 50);
                System.out.println();
                //Death.demise(mc);
            }//end of if   
            else{
                Tools.typeWriterVariables(("You resisted the Siren's chilling voices"), 50);
            }//end of else
            //The user's wisdom is increased
            mc.setWisdom(10);
        }//end of if
        Tools.typeWriterVariables(("You pass by the Anthemoessa region"), 50);
    }//end of song
}//end of Sirens class