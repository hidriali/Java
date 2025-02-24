/* this program displays all powre of 2 ( from, 0 to 20) inclusive
* Idris Ali
*  UNI : aa5663
*
*/



public class E1c{

  public static void main(String[] args){

    int result=0;
    for (int i = 0; i >= 0 && i <= 20; i++){
      result += (int) Math.pow(2,i); // casting math.pow to convert from double to int 
    } // to get a result of an int type

    System.out.println("The result is : " + result);


    // your code here 
    // you should compute and print the result here
    // use and update the variable result for each output

  }
}