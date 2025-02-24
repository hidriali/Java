/* this program computes the sum of all even numbers between 2 and 100 inclusive
*
*  Idris Ali 
* uni: aa5663
*/

import java.util.Scanner;

public class E1a{

  public static void main(String[] args){

    int sum=0; 
    
    
    for (int i = 2; i >= 2 && i <= 100; i = i+2){ // i updated to i+2 to get the next even number 
        sum = sum +i;
    }
   
    System.out.println("The sum is: " + sum);
    

    // your code here 
    // you should compute the sum as directed 
    // use the variable sum for your answer


    

  }
}