/* this program displays the sum of squares between 1 and 100 inclusive 
*
*  Idris Ali
* UNI: aa5663
*/



public class E1b{

  public static void main(String[] args){


    int sum=0;
    for (int i = 1; i >= 1 && i <= 100; i++ ){
        sum = sum + (int) Math.pow(i,2); // casting math.pow to convert from double to int (sum is int type)
    }
    


    // your code here 
    // you should compute the sum as directed 
    // use the variable sum for your answer


    System.out.println("The sum is: " + sum);

  }
}