package mid_java1;

import java.util.Optional;
public class Optionals {
	public static void main(String[] args) {
		String s[]=new String[5];
		
		//GANDHI PROGRAMMING
		//s[1]="HELLO";
		//System.out.println(s[1].toLowerCase());
		if(s[1]==null) {
			System.out.println("empty array...");
		}
		else {
			System.out.println(s[1].toLowerCase());
		}
		
		//RAHUL GANDHI PROGRAMMING
		
		String result=Optional.ofNullable(s[1]).orElse("DEFAULT");
		System.out.println(result.toLowerCase());
		
		//this will work only if it is not null
		//Optional.of(s[1]).ifPresent(i->System.out.println(i));
		
		//Optional.of(s[1]).ifPresentOrElse(System.out::println,()->{System.out.println("run run run");});
		
		//Optional.ofNullable(s[1]).ifPresentOrElse(System.out::println,()->{System.out.println("run run run");});
		s[1]="hellloooo";
		Optional.ofNullable(s[1]).ifPresentOrElse(Optionals::print,()->{System.out.println("run run run");});
		
	}
	static void print(String s) {
		System.out.println(s);
	}
}