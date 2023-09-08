package Avik;

public class Country {
    private String name;
    private String capital;

    public Country (String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public void printName() {
        System.out.println("This country's name is " + this.name);
    }

    public void printCapital() {
        System.out.println("This country's capital is " + this.capital);
    }
}