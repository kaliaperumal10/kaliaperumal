package labbook1;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
	int num = sc.nextInt();
			int reverse=0;
	while(num!=0)
	{
		int reminder =num%10;
		reverse=reverse*10+reminder;
		num=num/10;
	}
	System.out.println("Reverse number : "+reverse);
		
		
		/* String greet = "Hello! World";
		    System.out.println("String: " + greet);

		    // get the length of greet
		    //int length;
		    System.out.println("Length: " +"  \n "+greet.length());*/
		
		for(int i=1;i<=6;i++){ 
			  for(int j=1;j<=i;j++){ 
			    System.out.print("* "); 
			    } 
			    System.out.println();
		}
		    
	}

}
