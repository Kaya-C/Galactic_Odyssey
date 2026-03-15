/* 
Catherine Joseph
ICS 4U1
Jan 23, 2024
Culminating Project Task
*/

//subclass that extends Judgement
public class FieldsofAsphodel extends Judgement{
    
    //a constructor calling the superclass' constructor
    public FieldsofAsphodel(int morality){
        super(morality);
    }//end of constructor
    
    //Override method to display morality with a specific message for Fields of Asphodel
    @Override
    public void displayMorality() {
        System.out.println("⚖️  Morality: " + morality);
        System.out.println("Your journey has been one of neither/both of wickness and goodness");
    }//end of displayMorality
    
    //Override method to display a specific afterlife message for Fields of Asphodel
    @Override
    public void afterlifeMessage() {
        Tools.typeWriterVariables(("You find yourself in the vast wheatfields of the Fields of Asphodel, sentenced to wander aimlessly for all eternity 🌾"), 50);
        System.out.println();
        System.out.println("Neutral Ending");
    }//end of afterlifeMessage
}//end of FieldsofAsphodel