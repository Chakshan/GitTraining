import Chakshan.Example;
import Varun.Test;
import Ujjawal.Practice;

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
        practice.printMultiply();
        practice.printDivide();
        practice.printAdd();
        practice.printSubtract();
    }
}
