package test;
public class Anime {
	public static void main(String[] args) {
	Cn result=new Cn.Role("1psc ", "wholecheese").attack(true).run(true).build();
	System.out.println(result);
	System.out.println(result.cat()+" "+result.rat()+" "+result.attack()+" "+result.run());
	}}
class Cn{
	private String TOM;
	private String JERRY;
	private boolean Attack;
	private boolean Run;
	public String cat() {
		return TOM;
	}
	public String rat() {
		return JERRY;
	}
	public boolean attack() {
		return Attack;
	}
	public boolean run() {
		return Run;
	}
	private Cn(Role role) {
		this.TOM=role.TOM;
		this.JERRY=role.JERRY;
		this.Attack=role.Attack;
		this.Run=role.Run;
	}
	public static class Role{
		private String TOM;
		private String JERRY;
		private boolean Attack;
		private boolean Run;
		public Role(String tom,String jerry) {
		this.TOM=tom;
		this.JERRY=jerry;
		}
		public Role attack(boolean attack) {
			this.Attack=attack;
				return this;		}
		public Role run(boolean run) {
			this.Run=run;
			return this;	}
		public Cn build(){
			return new Cn(this);		
		} 	} 
	}