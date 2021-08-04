package Ujjawal;

public class Practice {

    private int num_1;
    private int num_2;

    public Practice(int num_1, int num_2) {
      this.num_1 = num_1;
      this.num_2 = num_2;
    }

    private int multiply() {
      return num_1 * num_2;
    }

    public void printMultiply() {
      System.out.println(num_1 + " x " + num_2 + " = " + multiply());
    }

    private int divide() {
        return num_1 / num_2;
    }

    public void printDivide() {
        System.out.println(num_1 + " / " + num_2 + " =" + divide());
    }
 
    private int add() {
      return num_1 + num_2;
    }

    public void printAdd() {
      System.out.println(num_1 + " + " + num_2 + " = " + add());
    }

      private int subtract() {
        return num_1 - num_2;
    }
  
      public void printSubtract() {
        System.out.println(num_1 + " - " + num_2 + " = " + subtract());
    }

}