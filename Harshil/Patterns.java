package Harshil;

public class Patterns {
    private int height;
    public Patterns(int height1) {
        height = height1;
    }
    public void Pattern1() {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void Pattern2() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = height; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void Pattern3() {
        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void Pattern4() {
        for (int i = 0; i < height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}