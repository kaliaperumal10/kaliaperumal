package mid_java1;

public class Teams {

	public static void main(String[] args) {
		Toss toss=new Toss();
		Heads heads=toss.getClass().getAnnotation(Heads.class);
		if(heads==null) {
			System.out.println("Lose the toss...");
		}else {
			System.out.println("Win the toss...");
		}
	}
	

}
