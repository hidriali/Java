/* this program displays the sum of all odd numbers between a and b
* where a and b are inputs
*  Idris Ali
*   UNI: aa5663
*/

import java.util.Scanner;

public class E1d{

  public static void main(String[] args){

    int sum=0; 
   
    Scanner inter;
    inter = new Scanner (System.in);
    
    
    System.out.println(" please inter a minimum odd number:");
    int a = inter.nextInt();  // a is the minimum number 
    while ( a % 2 == 0) { //  make sure the user inters an odd number 
      
      System.out.println(" please inter a minimum odd number:");
      a = inter.nextInt();
    }

    System.out.println("please inter a maximum odd number:");
    int b = inter.nextInt(); // b is the maximum number 

    while ( b % 2 == 0 || b < a) { // only one condition needed to be true
      
      System.out.println("please inter a maximum odd number:");
      b = inter.nextInt();
    }
    
    for ( int i= a ; i <= b; i= i+2  ) {  // the first condition is i = a ( means that a is included)
        
            sum= sum + i;
    }


    
    System.out.println(" the sum of is:"+ sum);
  }


    // your code here 
    // you should compute the sum as directed 
    // use the variable sum for your answer


    

  
}