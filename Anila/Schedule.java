package Anila;

import java.util.ArrayList;
import java.util.Scanner;

public class Schedule{
    private int studentID;
    private int grade;
    private String name;

    public Schedule(int id, int grade, String name){
        studentID = id;
        this.grade = grade;
        this.name = name;
    }

    

    public int numOfCourses(){
        if(grade == 9 || grade == 10){
            return 6;
        }else if(grade == 11){
            return 7;
        }else if(grade == 12){
            return 5;
        }else{
            return 0;   
        }
    }
    
    public ArrayList<String> getClassSchedule(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> listOfClasses = new <String>ArrayList();
        int counter = 0;
        while(counter < 5){
            System.out.print("Request a class: ");
            String c = input.nextLine();
            listOfClasses.add(c);
            counter++;
        }
        return listOfClasses;
    }
}