/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//subclass that extends Judgement
public class FieldsofPunishment extends Judgement {
    
    //a constructor calling the superclass' constructor
    public FieldsofPunishment(int morality) {
        super(morality);
    }//end of constructor

    //Override method to display morality with a specific message for Fields of Punishment
    @Override
    public void displayMorality() {
        System.out.println("⚖️  Morality: " + morality);
        System.out.println("Your journey has been one of selfishness and cruelty");
    }//end of displayMorality

    //Override method to display a specific afterlife message for Fields of Punishment
    @Override
    public void afterlifeMessage() {
        Tools.typeWriterVariables(("You ended up in the Fields of Punishment, a forsaken realm where the cries of sorrow and mercy will haunt you throughout eternity 🌑."), 50);
        System.out.println();
        System.out.println("Bad Ending");
    }//end of afterlifeMessage
}//End of FieldsofPunishment