package mid_java1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Thread3 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		//Theatre iMax=new Theatre();
		
		es.execute(
				()->{
					synchronized(Election.class) {
					Thread.currentThread().setName("person1");
					Election.voters.voting();
					}
				}
		);
		
		es.execute(
				()->{
					synchronized(Election.class) {
					Thread.currentThread().setName("person2");
					Election.voters.voting();
					}
				}
		);
		es.shutdown();
	}
}
class Voters{
	public void voting() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the vote booth...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" came out of booth...");
	}
}
class Election{
	static Voters voters=new Voters();
}