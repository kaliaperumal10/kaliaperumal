package classobjectMethod;

public class GarbageCollection {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Available Memory..:"+r.maxMemory());
		System.out.println("Available Processors..:"+r.availableProcessors());
		System.out.println("Free Memory..:"+r.freeMemory());		
		r.gc();
		System.out.println("Free Memory..:"+r.freeMemory());
		Grandfa tatha=new Grandfa();
		
		System.out.println("Free Memory..:"+r.freeMemory());
		System.out.println(tatha.getGold());
		tatha=null;
		//System.out.println(tatha.getGold());
	}

}
class Grandfa{
	String age;

	private String gold="under the tree...";
	
	public Grandfa() {
		for(int i=0;i<100;i++) {
			age=new String("hellllloooo..."+i);
		}
}
	protected String getGold() {
		return "this is gold ...:"+gold;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(getGold());
	}
	}