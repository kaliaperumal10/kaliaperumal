package labbook1;
import java.util.Scanner;
public class Oddeven {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] get = new int[5];
		 
		for(int i=0;i<5;i++)
		{
			get[i]=scan.nextInt();
		}
		for( int sum : get)
		{
			if(sum%2==0)
			{
				System.out.println("print even "+sum);
			}else
			{
				System.out.println("print odd "+sum);
			}	
		}
		
		
		

	}

}
