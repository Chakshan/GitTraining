import Chakshan.Example;
import Example.Cool;
import Varun.Test;
import Ujjawal.Practice;
import Saransh.Testing;
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

        Testing testing = new Testing(3, 2);
        testing.myHomework();
        testing.myTime();

        Challenge challenge1 = new Challenge(15,0);
        challenge1.Calculate();

        Challenge challenge2 = new Challenge(15,5);
        challenge2.Calculate();

        Cool cool = new Cool(8, "Epic");
        cool.printCoolNumber();
        cool.printCoolString();

    }
}
