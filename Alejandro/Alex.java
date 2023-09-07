package Alejandro;

public class Alex {
    private int task;
    private String phoneNumber;

    public Alex(int task, String phoneNumber) {
        this.task = task;
        this.phoneNumber = phoneNumber;
    }

    public void getPhone() {
        System.out.println("Alex's phone number is " + phoneNumber + ".");
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void getTask() {
        System.out.println("Alex's task count " + task + ".");
    }

    public void setTask(int task) {
        this.task = task;
    }

    public void call() {
        System.out.println("Alex has been called at " + phoneNumber + ".");
    }
}
