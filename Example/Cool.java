package Example;

public class Cool {
    
    private int coolNumber;
    private String coolString;

    public Cool(int coolNumber, String coolString) {
        this.coolNumber = coolNumber;
        this.coolString = coolString;
    }

    public void printCoolNumber() {
        System.out.println(this.coolNumber);
    }

    public void printCoolString() {
        System.out.println(this.coolString);
    }
}