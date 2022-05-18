package labbook1;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value");
		int n=s.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++) {
			//System.out.println(i);
			for(int j=1;j<=i;j++) {
				if(sum<=n)
				System.out.print(sum+" ");
				sum++;
			}
			System.out.println();
		}

	}

}
