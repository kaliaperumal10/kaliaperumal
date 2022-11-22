package uml;

import java.util.StringTokenizer;

public class Str_tok {

	public static void main(String[] args) {
		StringTokenizer Obj=new StringTokenizer("kyfhkjyh jkbhjk kgh kjhg h h h h");
		while(Obj.hasMoreTokens()) {
			System.out.println(Obj.nextToken());
		}
	}

}
