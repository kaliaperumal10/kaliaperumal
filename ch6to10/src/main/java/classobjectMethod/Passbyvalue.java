package classobjectMethod;
class bus{
	
	public static void travel() {
		System.out.println("moving");
	}
	}

public class Passbyvalue {
	
	public static void metd(int i)
	{
	 i+=10;
	System.out.println(i);
	
	}
	public  void metd1(int i,String s) {
		System.out.println(i+" "+s);
	}
	public void metd2(int a,String b,float c) {
		System.out.println(a+" "+b+" "+c);
	}
	
	public static void main(String[] args) {
		bus.travel();
		Passbyvalue obj=new Passbyvalue();
		obj.metd(20);
		obj.metd1(10,"hii");
		obj.metd2(10,"hii",11.11f);  
	}
	

}

