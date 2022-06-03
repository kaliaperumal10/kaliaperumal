package classobjectMethod;

public class This1 {
	/*String a;//instance variable
	public This1(String a) {
	this.a=a;//local variable
	}
	public static void main(String[] args) {
		//this keyword cannot be used inside a static method
		This1 obj=new This1("some value...");
		
		obj.printS("aaaaaaaaaa");
	}
	
	public void printS(String a) {
		System.out.println(this.a);
	}*/

	
	int p,q;	//instance variable
	void met1(int p,int q) {	//method1
		this.p=p;
		this.q=q;
		//System.out.println(p+" "+q);
	}
	void met2(int r,int s) {	//method2
		this.p=r;
		this.q=s;
		//System.out.println(r+" "+s);
	}
	void met3(int t,int u) {	//method3
		this.p=t;
		this.q=u;
		//System.out.println(t+" "+u);
	}
	void met4() {
		System.out.println(this.p+" "+this.q);
		
	}
	public static void main(String[] args) {
		This1 obj=new This1();
		obj.met1(3,4);
		obj.met4();
		obj.met2(1,2);
		obj.met4();
		obj.met3(5,6);
	
		
	}
}