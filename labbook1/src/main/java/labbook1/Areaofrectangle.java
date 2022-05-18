package labbook1;
import java.util.Scanner;

public class Areaofrectangle {

	public static void main(String[] args) {
		
		/*Scanner R = new Scanner(System.in);
		System.out.println("Enter the length : ");
		double length = R.nextDouble();
		System.out.println("Enter the width : ");
		double width = R.nextDouble();
		double r = length*width ;
		System.out.println(r);*/
		
		
		/*Scanner square = new Scanner(System.in);
		System.out.println("enter the side");
		double side = square.nextDouble();
		
		double area=side*side;
		System.out.println("area of square : "+area);*/
		
		
		/*Scanner triangle  = new Scanner(System.in);
		System.out.println("enter the length and width : ");
		double length = triangle.nextDouble();
		System.out.println(" width");
		double width = triangle.nextDouble();
		double hri = (length*width)/2 ;
		System.out.println("tri : " +hri);*/
		Scanner scanner = new Scanner(System.in); 
		 
        System.out.print("Enter the radius: "); 
        
        double radius = scanner.nextDouble(); 
        //Area = PI*radius*radius 
        double area = Math.PI * (radius * radius); 
        System.out.println("The area of circle is: " + area); 
        //Circumference = 2*PI*radius 
        double circumference= Math.PI * 2*radius; 
        System.out.println( "The circumference of the circle is:"+circumference) ; 

	}

}
