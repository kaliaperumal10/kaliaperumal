package mid_java1;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//A process within a process
public class Thread1 {
	public static void main(String[] args) {
		System.out.println("SOUP...");
		ExecutorService es=Executors.newFixedThreadPool(1);
		
		
		es.execute(()->{met1();});
		es.execute(()->{met();});
		//es.execute(new MyRunnable());
		es.shutdown();
//		Thread t=new Thread(new MyRunnable());
//		t.start();
		
		System.out.println("STARTER.....");
	}
	public static void met() {
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("MAIN ITEM....");
	}
	public static void met1() {
		try {Thread.sleep(2000);}catch(Exception e) {}
		System.out.println("ADDITIONAL ITEM....");
	}
}
//class MyRunnable implements Runnable{
//	@Override
//	public void run() {
//		Thread1.met();
//		Thread1.met1();
//	}
//}