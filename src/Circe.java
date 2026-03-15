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

//A class representing the encounter with Circe
public class Circe {
    //2D array representing the mixed DNA sequence
    static int[][] puzzle = {
            {5, 2, 9},
            {3, 7, 1},
            {4, 6, 8},
    }; //end of 2D array - puzzle

    // 2D array representing the orignal DNA sequence
    static int[][] solvedpuzzle = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    }; //end of 2D array - solvedpuzzle

    //indexs of the 2D arrays
    static int M = 3;
    static int N = 3;
    
    //global scanner
    static Scanner c = new Scanner(System.in);

    //global object
    static Odysseus mc;

    //The expedition to Circe's planet - passes the mc object from main class
    public static void expedition(Odysseus passmc) {
        //The object is passed to the global variable
        mc = passmc;
        
        //Display what happened to your crew
        File leaveOrStay = new File("CirceInteraction.txt");
        Tools.typeWriterFiles(leaveOrStay, 50);
        //your decision to leave or not
        System.out.println("1. Abandon half your crew and leave");
        System.out.println("2. Go rescue them");
        int option = Tools.getUserInput(1, 2);
        
        //user's Morality is impacted greatly
        if (option == 1) {
            Tools.typeWriterVariables(("You leave 22 of your crewmates behind and exit Aeaea"), 75);
            SpaceShip.setCrewmates(-22);
            mc.changeMorality(-11);
            Tools.typeWriterVariables(("Having uneasy feeling about the future, you journey into the Under Dimension and seek out the future from Tiresias, who could help you reach Ithaca"), 50);
        }//end of if
        else {
            Tools.typeWriterVariables(("You decide to save your crewmates, not wanting to lose even more of your people"), 75);
            mc.changeMorality(11);
            //calls the method to save your crew
            madScientist();
            System.out.println();
            Tools.typeWriterVariables(("Unfortunately, the commotion alerted Circe..."), 50);
            Tools.typeWriterVariables(("To your surprise, Circe is impressed by your ability to reverse her experiment and free your crew."), 50);
            Tools.typeWriterVariables(("She advises you to journey to the Under Dimension and seek out the future from Tiresias, who could help you reach Ithaca"), 50);
            System.out.println();
            Tools.typeWriterVariables(("Circe gives you a Quantum Singularities Cube, that uses the power of mini black holes to create a temporary and unique wormhole into the Under Dimension."), 50);
        }//end of else
    }//end of expedition

    //fix your crew's DNA by solving a puzzle
    public static void madScientist() {
        //Display what happens at the lab 
        File dna = new File("Lab.txt");
        Tools.typeWriterFiles(dna, 50);
        
        //game prompt
        System.out.print("Press Enter to Start the Game!");
        c.nextLine();

        Tools.typeWriterVariables(("Reassemble the numbers to restore your crewmates' DNA to its original sequence"), 50);
        
        //loop to solve the puzzle
        int rounds = 0;
        while (true) {
            print2DArrays(puzzle, 3, 3);
            System.out.println();
            System.out.println();

            System.out.print("Enter the first number you would like to swap: ");
            int targetElement1 = Tools.getUserInput(1, 9);

            System.out.print("Enter the second number you would like to swap: ");
            int targetElement2 = Tools.getUserInput(1, 9);

            //Find the indices of the inputed elements in the puzzle
            int[] indexs1 = linearSearch2D(puzzle, targetElement1);
            int[] indexs2 = linearSearch2D(puzzle, targetElement2);

            //Swap the inputted elements
            puzzle[(indexs2[0])][(indexs2[1])] = targetElement1;
            puzzle[(indexs1[0])][(indexs1[1])] = targetElement2;

            //Checks to see if the puzzle is solved by using DeepEquals - an array method from the Arrays library
            if (Arrays.deepEquals(puzzle, solvedpuzzle)) {
                System.out.println();
                Tools.typeWriterVariables(("The DNA mutation has been reversed and your crewmate all turn back to normal"), 50);
                //the less rounds you took to solve, the more points wisdom points you got
                double result = Math.pow(rounds, -1);
                int intResult = (int) result;
                mc.changeWisdom((intResult * 100));
                break;
            }//end of if
            rounds++;
        }//while
    }//end of madScientist

    //a method to print out the 2D arrays
    public static void print2DArrays(int[][] array2D, int M, int N) {
        for (int i = 0; i < M; i++) {
            System.out.println();
            for (int j = 0; j < N; j++) {
                System.out.print(array2D[i][j] + " ");
            } //end of for loop
        }//end of for loop
    }//end of print2DArrays

    //a method to do a linear search in a 2D array
    public static int[] linearSearch2D(int[][] puzzle, int target) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (puzzle[i][j] == target) {
                    int[] array = {i, j};
                    return array; //Element is found
                }//end of if
            }//end of for loop
        }//end of for loop
        return null; //Element is not found
    }//end of linearSearch2D
}//end of Circe class