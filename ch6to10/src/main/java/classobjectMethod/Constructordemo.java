package classobjectMethod;

public class Constructordemo {
	public static void main(String[] args) {
		//new School();
		School school=School.createSchool();
		System.out.println(school);
		
		school=School.createSchool();
		System.out.println(school);
		
		school=School.createSchool();
		System.out.println(school);
		
		school=School.createSchool();
		System.out.println(school);
		
		school=School.createSchool();
		System.out.println(school);
		
		school=School.createSchool();
		System.out.println(school);
		school=School.createSchool();
		System.out.println(school);
		school=School.createSchool();
		System.out.println(school);
	}
}
class School{
	private School() {
		System.out.println("school object created...");
	}
	static int count=0;
	static School schoolone=new School();	
	public static School createSchool() {
		if(count<5) {			
			count++;
			return new School();
		}
		else {
			return schoolone;
		}
	}
}


