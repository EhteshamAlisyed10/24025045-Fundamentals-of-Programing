
/**
 * Write a description of class Circle here.
 *
 * @author (Ehtesham Ali Syed)
 * @version (8-3-22)
 */
import java.util.Scanner;
public class Circle
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius =sc.nextDouble();
        System.out.println("Area of Circle is  : " + (radius*radius*3.14));
    }
}