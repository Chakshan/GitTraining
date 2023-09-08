import Chakshan.Example;
import Example.Cool;
import Karthik.Car;
import Varun.Test;
import Ujjawal.Practice;
import Saransh.Testing;
import Siddarth.Challenge;
import Avik.Country;

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

        Car car = new Car("Toyota","Corolla",2020, false);
        car.printMyCar();
        System.out.println("Car:"+car.getCarName());
        System.out.println("Age of Car:"+car.ageOfCar());

        Schedule schedule = new Schedule(12365, 11, "Bill");
        schedule.numOfCourses();
        schedule.getClassSchedule();

        Country usa = new Country("United States", "Washington D.C.");
        usa.printName();
        usa.printCapital();
    }
}
