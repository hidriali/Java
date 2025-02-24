/**
 * This program converts a number of days and weeks into the
 * equivalent number of minutes
 * 
 * @author: <Idris Ali>
 * @date: <2/6/2025>
 */
import java.util.Scanner;

public class Minutes{
    
    public static void main(String[] args){ // main method
         int weekDays = 7;
         int hoursInDay = 24;
         int minInHour = 60;
         
    
        Scanner input = new Scanner(System.in);

        System.out.println("please inter the number of days  :");
        int days = input.nextInt();

        System.out.println("please inter the number of weeks  :");
        int weeks = input.nextInt();

        int minutes= (weeks* weekDays *hoursInDay * minInHour) + (days * hoursInDay * minInHour);

        System.out.println(" minutes="+ minutes);



        
        
    }
}
 