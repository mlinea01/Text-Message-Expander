package textmsgexpander;
import java.util.Scanner;

public class TextMsgExpander {
    
    public static void main(String[] args) {
        /* Two arrays created, one to store the abbrevations, and another
        to store the values of those abbrevations. 
        */
        String[] abbr = {"BFF", "IDK", "JK", "TMI", "TTYL", "BRB", "LOL"};
        String[] abbr2 = {"best friend forever", "I don't know", "just kidding",
        "too much information", "talk to you later", "be right back",
        "laughing out loud"};
        
        //initialize string variable to hold the text input by the user. 
        String inputText;
        
        //Create scanner object to accept user input. 
        Scanner scnr = new Scanner(System.in);
        
        //Prompt user to enter text then output that text to the screen. 
        System.out.println("Enter text: ");
        inputText = scnr.nextLine();
        System.out.println("You entered: " + inputText);
        System.out.println("");
        
        /* a loop to go through the array of abbrevations and search for that 
           abbrevation in the user input text. 
           If the abbreviation is in the user text it will replace that
           abbrevation with it's meaning from the second array. 
           Then the exapanded version of the input text will be output to 
           the screen. 
        */
        for(int i = 0; i < abbr.length; i++)
        {
            if(inputText.contains(abbr[i]))
            {
                inputText = inputText.replace(abbr[i], abbr2[i]);
                System.out.println("Replaced \"" + abbr[i] + "\" with \"" + abbr2[i] + "\".");
            }
        }
        System.out.println("");
        System.out.println("Expanded: " + inputText);
    }
    
}
