/* this program displays the number of vowels in the string.
*
*  your information here
*
*/

import java.util.Scanner;

public class E3d{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string to be converted: ");
    String text = input.nextLine();
    String vowels = "aeuioAEUIO";
    int numberOfVowels = 0; // use this variable to store the total number of vowels
    for (int i = 0; i< text.length(); i++)

    {
      char c = text.charAt(i);
    
      for ( int j = 0; j < vowels.length(); j++ ){
        if ( c == vowels.charAt(j))
        {
            numberOfVowels += 1; // add 1 when vowel is found
          
        }
      }
      
    }
    System.out.println("The number of vowels is: " + numberOfVowels);


  }
}