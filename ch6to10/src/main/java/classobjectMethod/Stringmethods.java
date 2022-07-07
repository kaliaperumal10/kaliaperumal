package classobjectMethod;

public class Stringmethods {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		System.out.println(Integer.valueOf(b)+Integer.valueOf(a));
		String demo="james";
		String demo1="gosling";
		String demo2="    father of java   ";
		String demo4="JAMES";
		System.out.println(demo.concat(demo1));
		System.out.println(demo2.trim());
		System.out.println(demo2.replace("father", "doctor"));
		System.out.println(demo.equalsIgnoreCase(demo4));
		System.out.println(demo.repeat(4));
	}

}
