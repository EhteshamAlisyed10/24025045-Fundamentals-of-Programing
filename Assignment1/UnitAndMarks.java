
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
                do{System.out.println("Error : Invalid Input\nPlease enter the marks of student "+(i+1)+" again : ");
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
public static void main(String[] args){
    UnitAndMarks Assignment = new UnitAndMarks();
}
}
