package Karthik;
import java.util.Calendar;

public class Car{

private String make;
private String model;
private int year;
private boolean hybrid;

public Car(String make1, String model1, int year1, boolean hybrid1) {
    setMake(make1);
    setModel(model1);
    setYear(year1);
    setHybrid(hybrid1);
}

public void setMake (String make1) {
    make = make1;
}

public String getMake() {
    return make;
}

public void setModel (String model1) {
    model = model1;
}

public String getModel() {
    return model;
}

public void setYear (int year1) {
    year = year1;
}

public int getYear() {
    return year;
}

public void setHybrid (boolean hybrid1) {
    hybrid = hybrid1;
}

public boolean getHybrid() {
    return hybrid;
}

public void printMyCar() {
    System.out.println("Car Details >>>> ");
    System.out.println("Make:"+getMake());
    System.out.println("Model:"+getModel());
    System.out.println("Year:"+getYear());
    System.out.println("Hybrid:"+getHybrid());
    System.out.println("-----------------");
}

public int ageOfCar() {
    Calendar cal = Calendar.getInstance();
    int currentYear= cal.get(Calendar.YEAR);
    return (currentYear-year);
}

public String getCarName() {
    return make+" "+model;
}

public static void main(String []args){
   Car car = new Car("Toyota","Corolla",2020, false);
   car.printMyCar();
   System.out.println("Car:"+car.getCarName());
   System.out.println("Age of Car:"+car.ageOfCar());
}
}