/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use input and scan files
import java.util.*;

public class Death {
    //a global object
    static Odysseus mc;

    //a method for the demise of Odysseus
    public static void demise(Odysseus passmc) {
        mc = passmc;
        //tells the ending of your story
        Tools.typeWriterVariables(("As you draw your final breath, you fix your gaze on distant stars and pray that somewhere, your family will be safe."), 50);
        System.out.println();
        Tools.typeWriterVariables(("And as your consciousness fades, you apologize for failing them........."), 100);
        System.out.println();
        System.out.println();
        Tools.typeWriterVariables(("While your mortal life ends here, the echoes of your legendary journey will resonate through the vastness of the galaxies, leaving behind an immortal tale of triumphs, sacrifices, and unfulfilled dreams."), 50);
        //calls the method afterlife to ge the final fate
        afterlife();
    }//end of demise

    //a method for the passing away of Odysseus
    public static void passing(Odysseus passmc) {
        mc = passmc;
        //tells the ending of your story
        Tools.typeWriterVariables(("Time, once said to not go in a straight line by Tiresias ultimately did for you as you slowly aged."), 50);
        System.out.println();
        Tools.typeWriterVariables(("The once brilliant, daring, mighty Odysseus, blessed with one of the greatest wisdom of the ages, passes away, surrounded by loved ones, and peacefully transcends beyond the bounds of time and space."), 100);
        System.out.println();
        System.out.println();
        Tools.typeWriterVariables(("While your mortal life ends here, the echoes of your legendary journey will resonate through the vastness of the galaxies, leaving behind an immortal tale of triumphs, sacrifices, and fulfilled dreams."), 50);
        Tools.clearConsole(1000);
        System.out.println();
        Tools.pause(2500);
        Scanner x = new Scanner(System.in);
        //continue prompt
        System.out.println("Press Enter to see your final fate");
        x.nextLine();
        Tools.clearConsole(1000);
        //calls the method afterlife to ge the final fate
        afterlife();
    }//end of passing

    //a method to determine the user's fate in the afterlife
    public static void afterlife() {
        //displys the user's wisdom
        System.out.println("Throughout your life you got " + (mc.getWisdom()) + " wisdom points");
        System.out.println();
        Tools.pause(2500);

        Tools.typeWriterVariables(("Throughout your odyssey, pivotal choices were given — to confront, turn away, or show mercy and have been shaping your final destiny in the background."), 50);
        System.out.println();
        Tools.typeWriterVariables(("Now, the consequences of each choice will determine your place in the afterlife. Your morality, influenced by every action, now stands as the compass that decides your ultimate fate in ethereal realms beyond."), 50);
        Tools.pause(250);
        
        //gets Odysseus (mc) morality and stores it
        int yourMorality = mc.getMorality();
        Judgement yourFate;

        //the object yourFate gets initialized based on the user's morality
        if (yourMorality < -10) {
            yourFate = new FieldsofPunishment(yourMorality);
        } //end of if
        else if (yourMorality > 10) {
            yourFate = new Elysium(yourMorality);
        } //end of else
        else {
            yourFate = new FieldsofAsphodel(yourMorality);
        }//end of else
        
        //displays the user's final fate and message
        yourFate.displayMorality();
        yourFate.afterlifeMessage();

        Tools.pause(100);
        //The End
        Tools.typeWriterVariables(("The End."), 150);
        //the program stops
        System.exit(0);
    }
}//end of Death