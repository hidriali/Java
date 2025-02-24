
//This program implements the algorithm created by Fredrich Gauss 
//for determining the date of Easter
 
// @author: Idris Ali
// @date: 2/6/2025

import java.time.Month; 
import java.util.Scanner;
import java.time.format.TextStyle;
import java.util.Locale;

public class Easter{
  
    public static void main(String[] args){

        int a=0, d=0 , b=0, g=0, h=0, j=0, m=0, r=0, n=0, p=0, k= 0, c= 0, e=0; // declare and initilize 

         
        Scanner input = new Scanner ( System.in); // prompts the user to input a value 
        System.out.println(" please inter a number four numbers for a year :");
        int Year = input.nextInt();

        int y = Year;


        a = y % 19; // remindar
        b = y / 100; // quotient 
        c = y % 100; // remindar 
        d = b / 4; // quotient 
        e = b % 4; // reminder
        g = (8 * b + 13) / 25; // quotient
        h = (19 * a + b - d - g +15) % 30; // remindar 
        j = c/4; //quotient 
        k= c % 4; // remainder
        m=  (a + 11 * h)/319; // quotient 
        r = (2 * e + 2 * j - k - h + m +32) % 7 ; //remainder
        n =  (h - m + r + 90) / 25; //quotient, Month 
        p =   (h- m + r + n + 19) % 32; //reminder, Day 
        int monthNumber = n;
        
        Month month = Month.of(monthNumber);
        String monthName = month.getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.print("The Easter day fell on "+" "+ monthName +" "+ p+"st");
        





    }





}	
