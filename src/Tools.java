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

//A utility type of class that has methods for getting int input, typewriting effect, pausing and clearing the console.
public class Tools {
    //a method to get user input within a specified range and it being a intger - return the final answer
    public static int getUserInput(int min, int max){
        Scanner sc = new Scanner(System.in);
        int finalNumber;
        //Loop to ensure the final input is correct
        while (true){
            //A try-catch to handle non-integer inputs
            try{
                while(true){
                    System.out.print("Answer: ");
                    String number = sc.nextLine();
                    finalNumber = Integer.parseInt(number);
                    //Check to see if the input is within the specified range - if not the loop repeats
                    if (finalNumber >= min && finalNumber <= max){
                        break;
                    }//end of if
                    else{
                        System.out.println("Option not found.");
                    }//end of else
                }//end of while
                break;
            }//end of try
            
            catch(NumberFormatException e){
                System.out.println("Enter an Integer");
            }//end of catch
        }//end of while
        //returns the final answer
        return finalNumber;    
    }//end of getUserInput
    
    //Typewriter method for variables which accepts an String variable and the time you want each letter of the Variable to take to print out 
    public static void typeWriterVariables(String paragragh, int time){
        //a for loop that stops when i equal to the length of the variable passed
        for(int i = 0; i < paragragh.length(); i++){
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            //time = 0;
            //a try/catch statement to catch the InterruptedException that occurs when you use Thread.sleep(time) as it interrupts the code and makes it pause for (time) amount of milliseconds
            try{
                //prints out each character of the variable
                System.out.print(paragragh.charAt(i));
                //pauses the code for time milliseconds
                Thread.sleep(time);
            }//end of try
            catch(InterruptedException e){
                System.out.println("Exception" + e);
            }//end of catch
        }//end of for loop
        System.out.println();
    }//end of typeWriterVariables()
    
    //Typewriter method for files which accepts an File name and the time you want each letter of the File to take to print out 
    public static void typeWriterFiles(File file, int time){ 
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //time = 0;
        try{
            Scanner sc = new Scanner(file);
            //while the file has lines, this code will run
            while (sc.hasNextLine()){
                //scans the file and puts the line into a variable called line
                String line = sc.nextLine();

                for(int i = 0; i < line.length(); i++){
                    /* a try/catch statement to catch the InterruptedException that occurs when you use Thread.sleep(time) as it interrupts the code and makes it pause for (time) amount of milliseconds */
                    try{
                        //prints out each character of String line 
                        System.out.print(line.charAt(i));
                        Thread.sleep(time);
                    }
                    catch(InterruptedException e){
                        System.out.println("Exception" + e);
                    }
                }//end of for loop
                System.out.println();
            }//end of while loop
        }//end of try
        
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }//end of catch
        System.out.println();
    }//end of typewriter
    
    //a method that displays "printing dots"
    public static void dots(int time){
        //array that has the dots
        //time = 0;
        String[] dots = {"", ".", ".", "."};
        //a loop that displays each index of the dot arrays 
        try{
            for (int i = 0; i < dots.length; i++){
                System.out.print(dots[i]);
                //in each run of the loop, the code pauses for x amount for time
                Thread.sleep(time); 
            }//end of for-loop
        }//end of try
        catch(InterruptedException e){
            System.out.println("Exception" + e);
        }//end of catch
        System.out.println("");
    }//end of dots method
    
    // a method that clears the console
    public static void clearConsole(int time){ 
        try{
            Thread.sleep(time);
        }
        catch(InterruptedException e){
          System.out.println("Exception" + e);
        }
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }//end of clearConsole()
    
    //a method to pause the program for a specified time
    public static void pause(int time){
        try{
            Thread.sleep(time);
        }//end of try
        catch(InterruptedException e){
            System.out.println("Exception" + e);
        }//end of catch
        System.out.println();
    }//end of pause()
    
}//end of Tools