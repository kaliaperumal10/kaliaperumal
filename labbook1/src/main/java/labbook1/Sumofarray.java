package labbook1;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
	//int[] arr= {1,2,3,4,5,9};
	Scanner scan=new Scanner(System.in);
	int[] arr=new int[5];
		int num=0;
		System.out.print("Enter..: ");
		for(int i=0;i<5;i++)
		{
		arr[i]=scan.nextInt();
		}
	for(int sum : arr)
	{
		
		num=num+sum;
	}
	System.out.println(num);
	String[] s= {"gfg","ggg","eee","eee"};
	
	for(String n:s)
	{
		System.out.print(n);
		System.out.print(",");
	}
	}

}
