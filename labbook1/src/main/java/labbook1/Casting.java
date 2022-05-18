package labbook1;

public class Casting {

	public static void main(String[] args) {
		byte b=100;
		int n=b;
		b=(byte)n;
		System.out.println(b);
		//char c=99;
		//n=c;

		byte n1=2;
		byte n2=10;
		
		System.out.println(n1*n2);
		
		byte result=(byte)(n1*n2);//the result of an arithmetic operation will always be int
		System.out.println(result);
		float f=100.23f;
		n=(int)f;//float cannot be stored in int.
		System.out.println(n);
		f=n;//integer can be stored in float but not vice versa
		char c=173;

		//c=n;//you cannot store integer into a character
		
		System.out.println(c);
		System.out.println((char)n);

	}

}
