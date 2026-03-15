/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//allows the program to use Array methods
import java.util.Arrays;
//allows the program to use input and scan files
import java.util.*;
//allows the program to use files, print into file, and the FileNotFoundException
import java.io.*;

public class YourThrone {
    //global scanner
    public static Scanner i = new Scanner(System.in);
    //2D array representing the map of the palace with suitors marked as X
    public static String[][] palace = { 
            { "-", "-", "X", "X", "-" }, 
            { "-", "-", "-", "-", "-" }, 
            { "-", "X", "X", "X", "-" }, 
            { "X", "-", "", "-", "-" }, 
            { "-", "X", "-", "-", "X" }, 
            { "X", "-", "-", "X", "-" }, 
    };

    // 2D array representing the palace layout in total darkness
    public static String[][] mapPalace = { 
            { "-", "-", "-", "-", "-" }, 
            { "-", "-", "-", "-", "-" }, 
            { "-", "-", "-", "-", "-" }, 
            { "-", "-", "-", "-", "-" }, 
            { "-", "-", "-", "-", "-" }, 
            { "-", "-", "-", "-", "-" }, 
    };
    
    //there are 12 suitors
    public static int suitors = 12;

    //a method for the competition
    public static void competition() {
        File home = new File("Ithaca.txt");
        Tools.typeWriterFiles(home, 50);

        Tools.typeWriterVariables(("You must load your high-tech energy blaster."), 50);
        //game prompt
        System.out.print("Press Enter to start the loading process...");
        i.nextLine(); 
        System.out.println();
        //instructions for the game
        Tools.typeWriterVariables(("You must correctly arrange the steps in the correct order to load your blaster"), 50);

        System.out.println();

        Tools.typeWriterVariables(("Mixed order of steps:"), 50);

        // The correct order is: 4132
        System.out.println("1. Confirm the energy cell is securely loaded.");
        System.out.println("2. Sync the system to the energy ball");
        System.out.println("3. Activate the Quantum Energy system.");
        System.out.println("4. Insert the plasma energy ball into the blaster.");

        while (true) {
            System.out.println();
            //asks user what order they think it is
            System.out.print("Enter the correct order of the steps (ex. 1234): ");
            int stepOrder = Tools.getUserInput(1234, 4321);
            //if order is right, user proceeds with the game
            if (stepOrder == 4132) {
                Tools.typeWriterVariables(("Blaster successfully loaded!"), 50);
                System.out.println();
                break;
            } 
            else {
                Tools.typeWriterVariables(("Blaster loading failed."), 50);
            }//end of else
        }//end of while
        
        //cals the method to hit the target
        hitTheTarget();
    }//end of competition

    //a method for hitting the target after blaster is loaded
    public static void hitTheTarget() {
        //game prompt
        System.out.print("Press Enter to start shooting...");
        i.nextLine();
        System.out.println();
        
        //a loop that runs until you hit the target
        while (true) {
            boolean victory = shoot();
            if (victory == true) {
                Tools.typeWriterVariables(("You hit the target!"), 50);
                break;
            }//end of if
        }//end of while
        //calls the method to eliminate the suitors
        elimination();
    }//end of hitTheTarget

    //a method for shooting at the target - returns true if they hit the target
    public static boolean shoot() {
        int requiredAngle = 78;
        int requiredPower = 9;
        System.out.println();
        //asks user to put the angle and power they want to shoot at
        System.out.print("Enter your shooting angle (0-90 degrees): ");
        int angle = i.nextInt();

        System.out.print("Enter your energy strength (1-10): ");
        int power = i.nextInt();
        System.out.println();

        //if statement to check your angle and power and gives you feedback
        if (angle == 78 && power == 9) {
            return true;
        }//end of if

        if (angle < 78) {
            System.out.println("Your angle was too low");
        }//end of 
        else if (angle > 78) {
            System.out.println("Your angle was too high");
        }//end of else if
        else {
            System.out.println("Your angle was perfect");
        }//end of else

        if (power < 9) {
            System.out.println("Your power was too low");
        }//end of if
        else if (power > 9) {
            System.out.println("Your power was too high");
        }//end of else if
        else {
            System.out.println("Your power was perfect");
        }//end of else
        return false;
    }//end of shoot

    // a method for the game to eliminate the suitors
    public static void elimination() {
        System.out.println();
        //reaction from the people when user wins
        Tools.typeWriterVariables(("Disbelief courses through the crowd of people"), 50);
        System.out.println("Disbelief courses through the crowd of people");
        System.out.println();
        Tools.typeWriterVariables(("The other suitors yell that must have cheated for no one was able to load the blaster and hit the target yet so how can a mere beggar be able to do it"), 50);

        Tools.typeWriterVariables(("They all start advancing forward, intending to attack you"), 50);

        System.out.println();

        Tools.typeWriterVariables(("But then all the lights go out...all according to the plan."), 50);

        System.out.println();
        System.out.println();
        Tools.typeWriterVariables(("In the complete darkness, you must shoot the suitors and kill them all."), 50);

        System.out.println();
        //game prompt
        System.out.print("Press Enter to Start Eliminate the Suitors...");
        i.nextLine();
        System.out.println();
        Tools.typeWriterVariables(("Your friends have joined along with your son, Telemachus who has grown into a young man in 20 years"), 50);
        System.out.println();

        while (suitors > 0) {
            System.out.println();
            System.out.println("Suitors Remaining: " + suitors);
            System.out.println();
            attack();
            if (suitors == 7) {
                System.out.println("Telemachus eliminated one of the suitors.");
                suitors = suitors - 1;
            }//end of if
            if (suitors == 3) {
                System.out.println("Philoetius eliminated one of the suitors.");
                suitors = suitors - 1;
            }//end of if
        }//end of while loop
        Tools.typeWriterVariables(("You have eliminated all the suitors."), 50);
        System.out.println("You have eliminated all the suitors.");
    }//end of elimination

    //a method for attacking suitors in the palace
    public static void attack() {
        //calls method to show palace layout
        displayPalace();
        System.out.println();
        System.out.print("Enter row number(0-4): ");
        int x = Tools.getUserInput(0, 4);

        System.out.print("Enter target column (0-4): ");
        int y = Tools.getUserInput(0, 4);

        System.out.println();
        if (palace[x][y].equals("X")) {
            Tools.typeWriterVariables(("You hit a suitor!"), 50);
            palace[x][y] = "x";
            mapPalace[x][y] = "x";
            suitors = suitors - 1;
        } 
        else if (palace[x][y].equals("x")) {
            Tools.typeWriterVariables(("The suitor is already dead."), 50);
        }//end of else 
        else {
            Tools.typeWriterVariables(("You didn't hit anyone!"), 50);
        }//end of else
        System.out.println();
    }//end of attack()

    //a method for displays the palace layout
    public static void displayPalace() {
        int M = 5;
        int N = 5;
        System.out.println();
        System.out.println("    0   1   2   3   4");
        for (int i = 0; i < M; i++) {
            System.out.print(i + "   ");
            for (int j = 0; j < N; j++) {
                System.out.print(" " + mapPalace[i][j] + " ");
            }
            System.out.println();
        }//end of for
    }//end of displayPalace
}//end of YourThrone