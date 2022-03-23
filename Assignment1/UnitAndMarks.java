/**
 * Assignment 1 .
 *
 * @author (Ehtesham Ali Syed- 24025045)
 * @version (15-3-22)
 */

import java.util.Scanner;
import java.util.ArrayList;


public class UnitAndMarks
{
    private String unitName;
    private double marksOfStudents;
    private ArrayList<Double> studentMarks=new ArrayList<>();

    public UnitAndMarks()
    {
        getInput();
        display();
        findMinMax();
    }

    public void getInput()
    {
        System.out.println("Enter the Unit Name :");
        unitName = (new Scanner(System.in)).nextLine();
        System.out.println("Unit Name is : "+unitName);

        System.out.println("Enter the marks for 25 Students  :");
        double marks; 
        for(int i=0; i<5;i++)
        {
            System.out.println("Please enter the marks of student "+(i+1)+": ");
            marks = (new Scanner(System.in)).nextDouble();
            if(marks > 0 && marks <= 100)
                studentMarks.add(marks);
            else 
            {
                do{System.out.println("Invalid Input Please enter the marks between 0 - 100\n Now Please enter the marks of student "+(i+1)+" again : ");
                    marks = (new Scanner(System.in)).nextDouble();
                }while(marks < 0 || marks > 100);
                studentMarks.add(marks);
            }
        }
    }

    public void display(){
        System.out.println("The unit name is "+unitName+"\nThe student marks are as follows:\n");
        for(int i=0;i< studentMarks.size();i++){
            System.out.println("Student "+(i+1)+" marks : " + studentMarks.get(i)); 
        }
    }

    public void findMinMax(){
        double min = 0 ,max = 0;
        min = studentMarks.get(0);
        max = min;
        for(int i=1;i< studentMarks.size();i++){
            if(min > studentMarks.get(i)) 
                min = studentMarks.get(i);
            if(max < studentMarks.get(i))
                max = studentMarks.get(i);
        }
        System.out.println("The Maximum mark is : " +max+"\nThe Minimum mark is : " +min);
    }

    public static void main(String[] args){
        UnitAndMarks u = new UnitAndMarks();
    }
}
