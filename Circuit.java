/* 
 * This is the Circuit class that you have to create
 * for Problem 3
 * * name: Idris Ali
 
 * UNI: aa5663
 * 
 */
public class Circuit { 
    // instance vairables    
    private int firstSwitchState;
    private int secondSwitchState;
    private int lampState;

// values that don't change 
// the convention of final applied to constants all capital letters 
// these variables will be used in all methods 
    private final int ON = 1; 
    private final int OFF = 0;

    private final int DOWN = 0;
    private final int UP = 1;
    
    public Circuit() { 
        // initilized the instance vairables
        this.firstSwitchState = DOWN;
        this.secondSwitchState = DOWN; 
        this.lampState = OFF;
    }
    // instance methods 
    public void toggleFirstSwitch() { 
        if (firstSwitchState == DOWN) { 
            firstSwitchState = UP;
            lampState = (lampState +1) % 2;
        } else {
            firstSwitchState = DOWN;
            lampState = (lampState +1) % 2;
        }
    }
    
    public void toggleSecondSwitch() {
        if (secondSwitchState == DOWN) { 
            secondSwitchState = UP;
            lampState = (lampState +1) % 2;  
        } else {
            secondSwitchState = DOWN;
            lampState = (lampState +1) % 2;
        }
    }
    
    public int getLampState() {
        return lampState;
    }
  
    public int getFirstSwitchState() {
        return firstSwitchState;
    }    
   
    public int getSecondSwitchState() {
        return secondSwitchState;
    }
}