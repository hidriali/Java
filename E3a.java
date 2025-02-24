

/* this program display only the uppercase letters in the string input.
*
*  Idris Ali
*   UNI : aa5663
*/

import java.util.Scanner;

public class E3a{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string to be converted: ");
    String text = input.nextLine();
    String newText = "";
    // iterate through the string 
    for (int i =0; i < text.length(); i++ ){
       // c represents a character in the users string 
      //in each iteration c gets the next character
      char c = text.charAt(i); 
        
     // is uppercase() used to verify if the char is an uppercase letter
      if (Character.isUpperCase(c))
      {
        newText += c; 
      } 
              
    } 
    System.out.println("The converted text is : " + newText);




  }
}