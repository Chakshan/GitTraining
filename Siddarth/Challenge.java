package Siddarth;

public class Challenge {
    
    private int myDivisor;
    private int myDividend;

    public Challenge(int dividend, int divisor) {
        this.myDivisor = divisor;
        this.myDividend = dividend;
    }

     public void Calculate() {
         if(myDivisor != 0) {
            System.out.println("Dividing the two numbers will give you " + myDividend / myDivisor + "!");
         } else {
            System.out.println("Divisor must not be zero.");
         }
     }

}
