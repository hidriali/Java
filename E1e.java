/* this program compute and display the sum of all odd numbers of an input 
* 
*  your information here
*
*/


import java.util.Scanner;

public class E1e{

  public static void main(String[] args){

    int sum=0;
    Scanner input;
    input = new Scanner (System.in);
    
    
    System.out.println(" please inter a big number: ");
    String num= input.next(); // the input is a sequence of character (not a number)
  
    for ( int i= 0; i < num.length(); i++ ){ 
      
      //num.charAt(i) retrieves the character at position i in the string num.
     //Character.getNumericValue() converts this character to its numeric value.
      int number = Character.getNumericValue(num.charAt(i));
      
      if (number % 2 != 0){ // to test the number stored at number 
       
        sum = sum + number;}
    }
    
   System.out.println("The sum is: " + sum);
  }
   



    // your code here ..  int number= input nextInt();
    // you should compute the sum as directed 
    // use the variable sum for your answer


    
    
  
}