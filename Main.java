import Chakshan.Example;
import Varun.Test;
import Ujjawal.Practice;
import Siddarth.Challenge;

public class Main {
    
    public static void main(String args[]) {
        Example example = new Example(8, "Whimsical");
        example.favoriteNumber();
        example.favoriteString();

        Test test = new Test(5, 7);
        test.printAdd();
        test.printMax();
        test.printMin();

        Practice practice = new Practice(3, 8);
        practice.printAdd();
        practice.printSubtract();
        practice.printMultiply();
        practice.printDivide();

        Challenge challenge1 = new Challenge(15,0);
        challenge1.Calculate();

        Challenge challenge2 = new Challenge(15,5);
        challenge2.Calculate();

    }
}
