/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use input and scan files
import java.util.*;

//subclass that extends Judgement
public class Elysium extends Judgement{
    
    //a constructor calling the superclass' constructor
    public Elysium(int morality){
        super(morality);
    }//end of constructor
    
    //Override method to display morality with a specific message for Elysium
    @Override
    public void displayMorality() {
        System.out.println("⚖️  Morality: " + morality);
        System.out.println("Your journey has been one of righteousness and mercy");
    }//end of displayMorality
    
    //Override method to display a specific afterlife message for Elysium
    @Override
    public void afterlifeMessage(){
        Tools.typeWriterVariables(("You ended up in Elysium, the blessed realm for the mightiest and most noble heroes 🌕!"), 50);
        System.out.println();
        System.out.println("Good Ending");
        System.out.println();
        blest();
    }//end of afterlifeMessage
    
    //method only for Elysium that offers the option of rebirth
    public void blest(){
        Scanner x = new Scanner(System.in);
        Tools.typeWriterVariables(("An other-worldly voice speaks, 'Would you like to be reborn, to embark on another life and strive for Elysium three more times, with the reward being in the Isles of the Blest, a realm of eternal peace and bliss 🏝️ ?"), 50);
        //asks user if they want to be reborn
        Tools.typeWriterVariables(("The choice is yours. "), 50);
        System.out.println("1. Yes");
        System.out.println("2. No");
        int reborn = Tools.getUserInput(1, 2);
        //they are reborn
        if (reborn == 1){
            Tools.typeWriterVariables(("Your essence once again interweaves with stardust to forge a new life 🌌"), 50);
            System.out.println();
            Tools.dots(500);
        }//end of if
    }//end of blest
}//end of Elysium