/*
 * This is the BankAccount test class
 * to be used in Problem 2
 * You must add your code to this class
 * 
 

 * name: Idris Ali
 * UNI: aa5663
 */
    
     
    
public class BankTest {
  public static void main(String[] args) // main method is defined in BankTest class (similar to the file name)
 {
    BankAccount account = new BankAccount(0);// balance is initilized to 0
    
    
    account.deposit(10000);
    account.withdraw(600);
    account.withdraw(200);

    System.out.println( "remaining balance is : "+ account.getBalance());
 }
  
}

