package Chakshan;

public class Example {

    private int myNumber;
    private String myString;

    public Example(int num, String str) {
        this.myNumber = num;
        this.myString = str;
    }

    public void favoriteNumber() {
        System.out.println("My favorite number is " + myNumber + "!");
    }

    public void favoriteString()  {
        System.out.println("My favorite string is " + myString + "!");
    }
}