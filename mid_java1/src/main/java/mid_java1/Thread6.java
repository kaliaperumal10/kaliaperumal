package mid_java1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Thread6 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Battlebot_Game robot=new Battlebot_Game();
		es.execute(()->{
			for(int i=0;i<4;i++) {
				robot.movement();robot.attack();
			}
		});
//		es.execute(()->{
//			for(int i=0;i<5;i++) {
//				
//			}
//		});
		es.shutdown();
	}
}
class Battlebot_Game{
	boolean flag;
	
	synchronized public void movement() {
		
		if(flag) {
			try {wait();}catch(Exception e) {}
			
		}
		System.out.println("move to the enemy robot...........");
		flag=true;
		notify();
	}
	synchronized public void attack() {
		
		if(!flag) {
			try {wait();}catch(Exception e) {}
			
		}
		System.out.println("attack the enemy robot...........");
		flag=false;
		notify();
	}

	
	}
	