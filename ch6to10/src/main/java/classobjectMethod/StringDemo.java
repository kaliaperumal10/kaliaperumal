package classobjectMethod;

public class StringDemo {

	public static void main(String[] args) {
		//String str=new String();	//this will create two objects	
		String str1="hello";
		String str2="hello";//this will create one object
		String str3 = new String("hello");
		int a=5;
		//int b=new Integer(5);
		Integer b=new Integer("5");
		System.out.println(a==b);
		System.out.println(str3==str2);//this will compare the objects not the value
		//int cmp=str1.compareTo(str);
		System.out.println(str2.equals(str1));//equals method compares the values...
		System.out.println(str3.equals(str2));	
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.substring(2));
		
		String v=String.format("My name is is ..:%s","Billa");
		System.out.println(v);
		
		System.out.printf("My name is is ..:%s and my age is..:%d and my weight is..:%f","Billa",70,60.5f);
		System.out.println();
		System.out.printf("%.2f",100.23434343f);
		System.out.printf("\n %-4s %101s %20s", "SNo","Name","Company");
	}
	
	

}
