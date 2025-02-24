/* 
 * This is the Car class that you have to create
 * for problem E3.13
 * 
 * name: Idris Ali 
 * UNI: aa5663
 * 
 */

public car class{
  
    //  for this problem don't worry about the maximum amount of gas
    //  allowed in the tank or tracking the overall miles driven
  
    // instance vairables, could be used in any method inside the class CarTester
    private double gasRemaining; // in gallons
    private double efficiency; // gsa mileage in miles per gallon
    
    // this is the constructor
    public CarTester(double efficiency){ // efficiency is specified 

    // this. uesed to make sure that we don't use the instance variable value "0"
       this.efficiency = efficiency; 
       gasRemaining = 0.0; // initilized to 0.0 whenever a new object is instantiated

    }


    // this is a mutator method
        // that reduces the gas in the tank

    public void drive(double gasMileage) // tells us how many miles dove 
    {
        double gasUsed = gasMileage/efficiency; // gasUsed  = miles /gas mileage per gallon
        gasRemaining = gasRemaining - gasUsed; // gasRemining is in gallon
    }
    
    // this is a mutator method
        // that adds gas to the tank

    public void addGas(double gasAmount){
        gasRemaining += gasAmount;       
    }
    
    // this is an accessor method for the gas in the tank
        // your code here
    public double gasLeft()
    {
        return gasRemaining;
        
    }
    
    
    
}

