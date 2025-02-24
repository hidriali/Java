/* this program display the positions of all vowels in the string.
*
*  your information here
*}
        
*/

import java.util.Scanner;

public class E3e{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to be converted: ");
        String text = input.nextLine();
        String vowels = "iaoueIAOUE";
        for ( int i = 0; i <text.length(); i++){
            char c = text.charAt(i);
            
            for(int j=0; j < vowels.length(); j++){
                char d = vowels.charAt(j);
                if (c == d)
                
                {    
                    System.out.println(" character found is : " + c + "\n"+ "at index :"  + i);
                    
                }
    
            } 
             

        }   

        
    }

}    

    



