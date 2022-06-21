package mid_java1;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Thread2 {
	public Thread2() {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(()->{System.out.println("child thread called...");});
		es.shutdown();
		//System.out.println("childthre.................");
	}
	public static void main(String[] args) {
		new Thread2();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
