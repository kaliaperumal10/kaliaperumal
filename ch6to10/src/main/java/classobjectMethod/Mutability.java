package classobjectMethod;


public class Mutability {
	
	
	static public  void main(String[] args) {
		int x=10;
		int y = x;
		x+=10;
		System.out.println(x);
		System.out.println(y);
		
		String a="david";
		String b=a;
		a+="billa";
		System.out.println(a);
		System.out.println(b);
		Pbr obj =new Pbr();
		
		
		
		
	}

}
class Pbr{
	
}