/* this program displays Every second letter of the string
*
*  Idris Ali
* UNI : aa5663
*/

import java.util.Scanner;

public class E3b{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string to be converted: ");
    String text = input.nextLine();
    String newText = "";

    // starting from the seceond index, then the second after it and so on 
        for (int i=1; i < text.length(); i+=2)
        {
        newText += text.charAt(i);

    
        }
        System.out.println("The converted text is: " + newText);
        


  }
}