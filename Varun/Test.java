package Varun;

public class Test {

    private int a;
    private int b;

    public Test(int a, int b) {
      this.a = a;
      this.b = b;
    }

    private int getMax() {
      if(a > b) return a;
      return b;
    }

    public void printMax() {
      System.out.println("The max of " + a + ", and " + b + " is " + getMax());
    }

    private int getMin() {
      if(a < b) return a;
      return b;
    }

    public void printMin() {
      System.out.println("The min of " + a + ", and " + b + " is " + getMin());
    }
 
    private int add() {
      return a + b;
    }

    public void printAdd() {
      System.out.println(a + " + " + b + " = " + add());
    }

}