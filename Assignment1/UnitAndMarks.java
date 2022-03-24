/**
 * Assignment 1 - In this assignment we are going to take input of unit name 
 * and marks of 25 students from the user.
 *In which we are going to find the maximum and minium marks of the students.
 *and calculate the mean and standard deviation of the student marks.
 *
 * @author (Ehtesham Ali Syed- 24025045)
 * @version (15-3-22)
 */

import java.util.Scanner;  //This import Scannner is used to collect the input
import java.util.ArrayList;//This import Arraylist is used for defining arraylist
import java.lang.Math;     //This import Math is used for calculating square root in this program     

public class UnitAndMarks
{
    private String unitName; //Declaring a string variable to store the unit name
    private double marksOfStudents;//Declaring a double variable to store the marks of students
    private ArrayList<Double> studentMarks=new ArrayList<>(); //Declaring an arraylist for studentmarks

    public UnitAndMarks() // it is the constructor of the  class UnitAndMarks
    {
        getInput();
        display(); 
        findMinMax();
        findMeanAndSD();

    }

    public void getInput() //This function is used to take the inputs from the user
    {
        System.out.println("Enter the Unit Name :");
        unitName = (new Scanner(System.in)).nextLine(); //unitName is variable which is used to store the unit name
        System.out.println("Unit Name is : "+unitName);

        System.out.println("Enter the marks for 25 Students  :");
        double marks; //marks is a variable which is used only in this function to compare with other student's marks
        for(int i=0; i<25;i++) //In this for loop we have set the counter to 25 after reaching this, loop will be stopped
        {
            System.out.println("Please enter the marks of student "+(i+1)+": ");
            marks = (new Scanner(System.in)).nextDouble();
            if(marks > 0 && marks <= 100) //in this function if the mark is entered between 0-100 it will be stored.
                studentMarks.add(marks);
            else //in this else function if the mark is entered less than zero or greater than hundred then it will shows invalid input 
                // and allows the user to re-enter the marks of that student again
            {
                do
                {
                    System.out.println("Invalid Input Please enter the marks between 0 - 100\n Now Please enter the marks of student "+(i+1)+" again : ");
                    marks = (new Scanner(System.in)).nextDouble();
                }
                while(marks < 0 || marks > 100);
                studentMarks.add(marks);
            }
        }
    }

    public void display() //This function is used to display the unit name and marks of the students
    {
        System.out.println("The unit name is "+unitName+"\nThe student marks are as follows:\n");
        for(int i=0;i< studentMarks.size();i++)
        {
            System.out.println("Student "+(i+1)+" marks : " + studentMarks.get(i)); 
        }
    }

    public void findMinMax()//This function is used to find minimum and maximum of marks of students
    {
        double min = 0 ,max = 0;//Here we are declaring two variables as min and max to store and find min & max marks of the students
        min = studentMarks.get(0);
        max = min;  
        /** 
         * In this function, First element(mark) we will assign to both min and max. after this we will starting comparing with others.
         * Then based on our condition lesser or greater marks will be assign to min and max.
         */
        for(int i=1;i< studentMarks.size();i++) 
        {
            if(min > studentMarks.get(i)) 
                min = studentMarks.get(i);
            if(max < studentMarks.get(i))
                max = studentMarks.get(i);
        }
        System.out.println("\nThe Maximum mark is : " +max+"\nThe Minimum mark is : " +min);
    }

    public void findMeanAndSD()//This function is used to calculate mean and standard deviation
    {
        double mean  = 0, sum=0,  standardDeviation = 0;//Declaring variables to find and store the values of marks of students
        for(int i=0;i< studentMarks.size();i++) 
        {
            sum  += studentMarks.get(i); //sum of all marks of students
        }
        mean=sum/studentMarks.size();// mean= sum of all marks of students / number of students
        for(int i=0;i< studentMarks.size();i++)
        {
            standardDeviation += ((studentMarks.get(i)-mean)*(studentMarks.get(i)-mean));
        }
        standardDeviation /= (studentMarks.size()-1); // Standard deviation = Standard deviation/ (number of students-1)
        standardDeviation = Math.sqrt(standardDeviation); // Math.sqrt is used to find square root
        System.out.println("\nThe Mean of the marks is : "+mean);
        System.out.printf("\nThe Standard Deviation is %.2f",standardDeviation);//%.2f is used to get number upto two decimal value only.

    }  

    public static void main(String[] args)
    {
        UnitAndMarks assignment = new UnitAndMarks();
    }
}
