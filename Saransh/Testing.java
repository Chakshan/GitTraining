package Saransh;

public class Testing {
    
    private int myHomework;
    private int myTime;

    public Testing(int myHomework, int myTime) {
        this.myHomework = myHomework;
        this.myTime = myTime;
    }

    public void myHomework() {
        System.out.println("I have homework from " + myHomework + " classes today.");
    }

    public void myTime() {
        System.out.println("I have " + myTime + " hours to complete my homework.");
    }
}