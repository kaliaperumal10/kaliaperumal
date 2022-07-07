package labbook1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		int p=scan.nextInt();
		//int s=10,p=20;
		/*k=s;
		s=p;
		p=k;
		System.out.println(s +"\t"+p);*/
	s=s+p;
	p=s-p;
	s=s-p;
		System.out.println(s +"\t"+p);
		
		
		
	}

}
