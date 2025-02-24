/**
 * This program determines how to give change to a customer
 * who provides a price and amount paid.
 * 
 * @author: <Idris Ali>
 * @date: <2/6/2025>
 */

import java.util.Scanner;

public class Change{
  
    public static void main(String[] args)
    {
        int amountDue = 40, dollars=0, quarters= 0, dims= 0, nickles= 0, pennies=0;

        Scanner input = new Scanner (System.in);
        System.out.println(" plaese inter the amount you want to pay in dollars :");
        int amountReceived = input.nextInt();
        dollars = amountReceived - amountDue;
        quarters = dollars * 4;
        nickles = dollars * 20;
        dims = dollars * 10;
        pennies = dollars * 100;
        System.out.println("change in dollars is : ");
        System.out.println(dollars);

        System.out.println("change in quarters is :");
        System.out.println(quarters);

        System.out.println("change in dims is :");
        System.out.println(dims);

        System.out.println("change in  nickles is :");
        System.out.println(nickles);

        System.out.println("change in pennis is : ");
        System.out.println(pennies);
        
      


    





        // your code here!


    }





}	