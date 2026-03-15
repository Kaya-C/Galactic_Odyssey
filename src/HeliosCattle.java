/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use files, print into file, and the FileNotFoundException
import java.io.*;

//A Class what happens with Helios Cattle and the consequences
public class HeliosCattle {
    public static int cowsFate2;

    //a method that shows what happens with cattle herds
    public static void cattleHerds(Odysseus mc) {
        //the background of the situation
        Tools.typeWriterVariables(("Several months have passed, but you are still nowhere near home as Poseidon keeps sending cosmic currents to delay your trip."), 50);
        Tools.pause(2500);
        Tools.typeWriterVariables(("Poseidon, who was on the side of the Trojans during the war, was already mad at the Achaeans for winning the war."), 50);
        Tools.typeWriterVariables(("By stabbing his creation, Polyphemus, you have invoked Poseidon's wrath."), 50);
        System.out.println();
        Tools.typeWriterVariables(("Your crew is starving now, with most of the supplies being destroyed by the Laestrygones."), 50);
        Tools.typeWriterVariables(("You land on Planet Thrinakia, where you find some herds of Heavenly Cows belonging to Helios, the entity of the Solar Stars."), 50);

        Tools.typeWriterVariables(("Having already enraged one's divine being, should you: "), 50);
        //gives you the choice to slaughter or look for other food
        System.out.println("1. Slaughter the cows for food ");
        System.out.println("2. Look around the planet");
        int cowsFate1 = Tools.getUserInput(1, 2);
        System.out.println();

        if (cowsFate1 == 1) {
            // Present Tiresias' prophecy and confirm the decision
            Tools.typeWriterVariables(("Tiresias prophecy: 'Feast not on a creature so rare, For the Sun's wrath, you shall bear' "), 50);
            //asks you again if you are sure
            Tools.typeWriterVariables(("Are you sure: "), 50);
            System.out.println("1. Yes");
            System.out.println("2. No");

            cowsFate2 = Tools.getUserInput(1, 2);

            if (cowsFate2 == 1) {
                //A scenario if the crew decides to slaughter the cows
                System.out.println("You finally have some food to eat and celebrate with a party");
                System.out.println("After so long, the crew seems truly happy");
            }//end of if 
            else {
                //the scenario where you decide not to eat the cows
                mc.changeWisdom(3);
                //calls a method
                noEat();
            }//end of else
        } 
        else {
            // the crew does not to eat the cows 
            mc.changeWisdom(5);
            noEat();
        }//end of else

        //Departing from Thrinakia and the space storm
        Tools.typeWriterVariables(("Departing from Thrinakia, the star in its orbit grows unexpectedly larger and brighter, casting a radiant glow as you leave the system."), 50);
        System.out.println();
        
        //imagery of the storm from a file
        Tools.pause(2000);
        Tools.clearConsole(1000);
        File storm = new File("SpaceStorm.txt");
        Tools.typeWriterFiles(storm, 50);

        if (cowsFate2 == 1) {
            //Scenario if you slaughtered the cows and the consequences
            Tools.typeWriterVariables(("Amidst the chaos, you find yourself trapped under the rubble of the ship. The weight of the debris becomes suffocating, and despite all desperate efforts to free yourself, you start succumbing to the lack of air."), 50);
            Tools.typeWriterVariables(("A once-promising journey home now lies burned away in the cold void of space."), 50);
            System.out.println();
            //you die
            //Death.demise(mc);
        } else {
            //Scenario if your didnt slaughter the cows
            System.out.println();
            Tools.typeWriterVariables(("Perhaps by sheer luck or a cruel twist of fate, you find yourself thrown back near an escape pod, just as the ship reaches its breaking point. In a desperate fight for survival, you get into the pod and randomly hit a button that sends you flying at hyperspeed, as the ship behind you completely explodes."), 50);

            System.out.println();
            //everyone on your crew is died
            SpaceShip.setCrewmates(-((SpaceShip.getCrewmates())));
            SpaceShip.setShipHealth(-((SpaceShip.getShipHealth())));
            Tools.typeWriterVariables(("As you move further and further away, the merciless fate of the rest of the crew becomes painfully obvious. A once-promising journey home now lies shattered in the cold void of space."), 50);
        }//end of else
    }//end of cattleHerds

    //if you didnt not eating the cows
    public static void noEat() {
        Tools.typeWriterVariables(("You warn your crew not to slaughter the cow"), 50);

        Tools.typeWriterVariables(("Eurylochus tells you that you're a coward, but you yell that such disrespect will not be tolerated"), 50);

        Tools.pause(2500);

        Tools.typeWriterVariables(("Since the crew seems miserable after all the losses, you decide to hold a party with the remaining food, stating you will look around the planet for food after"), 50);

        Tools.pause(2500);
        
        //The Crew's backstories
        Tools.typeWriterVariables(("With the party at full swing, everyone starts to open up and talk about their life"), 50);

        Tools.pause(1500);
        System.out.print("Perimedes: ");
        Tools.typeWriterVariables(("I have a daughter waiting for me to come back home to get married."), 50);

        Tools.pause(1500);
        System.out.print("Lycaon: ");
        Tools.typeWriterVariables(("I wanted to become a musician before the war, so when I reach home, I'm going to travel around the galaxy to fulfill that dream."), 50);

        Tools.pause(1500);
        System.out.print("Amphialos: ");
        Tools.typeWriterVariables(("I have an elderly mother and several siblings that all needed the money this job bought; I can't wait to come home and see them again."), 50);

        Tools.pause(1500);
        System.out.print("Antilochus: ");
        Tools.typeWriterVariables(("I have a lover, but her high-ranking parents disapprove of our marriage. I enlisted in this war to become someone worthy of her."), 50);

        Tools.pause(1500);
        System.out.print("Alkimos: ");
        Tools.typeWriterVariables(("Geez guys, I just want to open up a small shop and have a family"), 50);

        Tools.pause(1500);
        System.out.print("Amphidamas: ");
        Tools.typeWriterVariables(("Alkimos, make me a co-founder of your shop"), 50);

        Tools.pause(500);
        System.out.print("Alkimos: ");
        Tools.typeWriterVariables(("And let it go bankrupt? Yea no."), 50);

        Tools.pause(500);
        System.out.print("You: ");
        Tools.typeWriterVariables(("I have a wife and kid named Telemachus who I last saw as an infant; he must have turned 13 years old by now...."), 50);

        System.out.println();

        Tools.pause(2500);
        Tools.typeWriterVariables(("As the party dies down, you leave by yourself to search for some food"), 50);

        Tools.pause(5000);
        Tools.dots(1000);
        Tools.typeWriterVariables(("You were able to find some berries and return back to the camp"), 50);

        Tools.pause(5000);
        
        //Mutiny from the crew
        System.out.print("Eurylochus: ");
        Tools.typeWriterVariables(("Why should we listen to a captain who let more than 500 of our people die. Feast on the cows, my friends, for we will surely die from starvation if we don't "), 50);
        System.out.println();
        Tools.typeWriterVariables(("You come back to find herds of Helios' cows killed and eaten"), 50);
        Tools.typeWriterVariables(("How could you! Foolish."), 50);

        System.out.print("Eurylochus: ");
        Tools.typeWriterVariables(("The celestial beings have already abandoned us! "), 50);

        Tools.pause(5000);

        Tools.typeWriterVariables(("You knew that tensions were high among the crew due to the losses, but now it appears that a mutiny is occurring among some of them.! "), 50);

        Tools.typeWriterVariables(("Nevertheless, it's better that you deal with it on the ship after you left the planet in case Helios himself drops by! "), 50);

        Tools.typeWriterVariables(("You tell your crew that are on your side that Helios would be coming for all of us soon and it's better to leave now. The mutinous crew also decides to follow as the realization of what they have done finally sets in "), 50);
    }//end of noEat
}//end of HeliosCattle