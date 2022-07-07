package labbook1;

 import java.util.Scanner;
import java.util.Scanner;

public class Asciiv {
	
	
	public static void main(String[] args) {
		String asciistr;
		int i;	
		Scanner sc= new Scanner(System.in);

		System.out.print("\n Please Enter any Sentence for ASCII Codes :  ");
		asciistr = sc.nextLine();
			
		for(i = 0; i < asciistr.length(); i++)
		{
			System.out.println("The ASCII Value of " + asciistr.charAt(i) +
					" Character = " + asciistr.codePointAt(i));
		}
	}
}