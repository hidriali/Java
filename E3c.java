/* this program displays a string, with all vowels replaced by an underscore.
*
*  Idris Ali
* UNI : aa5663
*/

// I wanted to use a boolean flg instead of an else if statement, I used an AI software 

import java.util.Scanner;

public class E3c{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string to be converted: ");
    String text = input.nextLine();
    String newText= "";
    String vowel= "ioueaIOUEA";//  vowel letters 
    boolean found;

        for (int i=0; i < text.length(); i++){
            char c = text.charAt(i);
            boolean found = false; // boolean flag, initilized in the outer loop 
            // to reset the boolean after each iteration 
      
            for ( int j = 0; j < vowel.length(); j++){   
                if ( c == vowel.charAt(j)) { 
                    found = true; 
                }
            }     
                if(found)
                {
                    newText += "_";
                } 
                    else 
                    {                             
                    newText += c;
                    }
            
        }      
            
        
           System.out.println("The converted text is: " + newText); 
    } 
        

} // use this variable for your converted text



    


  
