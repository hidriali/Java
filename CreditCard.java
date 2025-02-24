/*  creating a card class that stores a card number as a string and check for the follwing 
*The first digit must be a 4.
The fourth digit must be one greater than the fifth digit.
The product of the first, fifth, and ninth digits must be 24.
The sum of all digits must be evenly divisible by 4.
The sum of the first four digits must be one less than the sum of the last four digits.
If you treat the first two digits as a two-digit number, and the seventh and eight 
digits as a two digit number, their sum must be 100.
*  your information here

Author : Idris Ali
UNI   : aa5663
*
*/
import java.util.Scanner;
class CreditCard
{
    //instance variables 
    private String cardNumber; 
    // boolean flag 
    private boolean valid; // boolean flag
    private int errorCode; 
    public final int  first = 4; // the number will not change that is why we used public 
    
// constructor
    public CreditCard(String cardNumber){
         this.cardNumber = cardNumber;
         this.valid= false; 
         this.errorCode = 0;
    }     

    

    public void check()//mutator 
    {

// using parseint to convert the string to a number
// substring to get a specific element in the string  
// the if statements are designed to find errors
// if there is no error the number is valid 
// if there is an error the getErrorCode will tell you what/where the error accur 
// for example: if it was the first check, the getErrorCode method will return 1 and so on 
// the return statement used to exit the code as soon as there is an error.
// Boolean flag served to check if the number is valid after all the checks. 
// also the Boolean flag used to return a value for isValid method.
            
             
        if ( Integer.parseInt(cardNumber.substring(0,1))!= first){
            errorCode= 1;
            return;
            }
            
        if (Integer.parseInt(cardNumber.substring(3,4)) != Integer.parseInt(cardNumber.substring(5,6))+1)
        {
             errorCode=2;
             return;
        }
            
            
        if (first* Integer.parseInt(cardNumber.substring(5,6))*Integer.parseInt(cardNumber.substring(10,11))
            != 24)
            {
                 errorCode=3;
                 return;
            }
            int sum=0; // in the scope of (can be used anywhere in the class)
        for (int i=0; i < cardNumber.length();i++)
            {
                if (cardNumber.charAt(i) != '-'){
                    sum+= Integer.parseInt(cardNumber.substring(i,i+1));// repeat till the last index
                }
            }
        
        if (sum % 4 != 0) // sum is not divisible by 4
            {
                errorCode=4;
            }

        
        int sum1 = Integer.parseInt(cardNumber.substring(0, 1)) + 
               Integer.parseInt(cardNumber.substring(1, 2)) +
               Integer.parseInt(cardNumber.substring(2, 3)) +
               Integer.parseInt(cardNumber.substring(3, 4));
        int sum2 = Integer.parseInt(cardNumber.substring(10, 11)) +
               Integer.parseInt(cardNumber.substring(11, 12)) +
               Integer.parseInt(cardNumber.substring(12, 13)) +
               Integer.parseInt(cardNumber.substring(13,14));
        
        if (sum1 != sum2 -1)
        {
            errorCode= 5;
            return;
        }
            
        
        if ( Integer.parseInt(cardNumber.substring(0,2)) + Integer.parseInt(cardNumber.substring(7,9)) !=100)    
        { // returns: index 0 and 1 + index 7 and 8
             errorCode = 6;
             return;

        }

        valid = true;   

    }
     // accessor 
    public boolean isValid()
    {
        return valid;

    }
     // accessor 
    public int getErrorCode()
    {
        return errorCode;

    }
}    