/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

// Superclass
public class Judgement {
    // Global variable to store morality
    public int morality;

    //a constructor to initialize morality
    public Judgement(int morality) {
        this.morality = morality;
    }//end of constructor

    //a method to display the character's morality
    public void displayMorality() {
        System.out.println("⚖️  Morality: " + morality);
    }//end of displayMorality

    //a method to display an afterlife message
    public void afterlifeMessage() {
        System.out.println("You enter the inner underealm, and are judged by King Minos, Aeacus, and Radamanthus");
    }//end of afterlifeMessage
}// End of Judgement