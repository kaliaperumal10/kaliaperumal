package classobjectMethod;
public class Calculator {
	void add1(int i,int j) {
		int sum=i+j;
		System.out.println("the sum of "+i+"and "+j+"is..:"+sum);
	}
	
	int add2(int i,int j) {
		return i+j;
	}
	
	void add3(int i,int j) {
		display(i+j);
	}
	
	void display(int s) {
		System.out.println("The result is..:"+s);
	}
	
	void add4(int ...i) {
		int result=0;
		for(int s:i) {
			result=result+s;
		}
		System.out.printf("The result is ...:%d", result);
	}
	
	void add5(int i[]) {
		int result=0;
		for(int s:i) {
			result=result+s;
		}
		System.out.printf("The result is ...:%d", result);{
		System.out.println("kk);
	}

//public class TestCalculator {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		
		calc.add1(10, 20);
		int result=calc.add2(100,20);
		
		System.out.println(result);
		
		calc.add3(10,20);
		
		calc.add4(10,20,100,300,10);
		
		calc.add5(new int[] {10,20,30,40});
	}
}
