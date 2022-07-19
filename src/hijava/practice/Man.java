package hijava.practice;

public class Man {
	public static final int COFFEE = 3000;
	public static final int DONUT = 2500;
	
	private String name;
	private int amount;
	
	public Man() {
		this.amount = 10000;
	}
	
	public Man(String name) {
		this();
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("안녕하세");
		System.out.println("제 이름은 " + this.getName() + "입니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Man [name=" + name + ", amount=" + amount + "]";
	}
	
	public static void main(String[] args) {
		
//		Man hong = new Man("Hong");
//		Man kim = new Man("Kim");
//		Man kildong = hong;
//		Man ilsoo = new Man("Kim");
//		
//		System.out.println("hong hash=" + hong.hashCode());
//		System.out.println("kim hash=" + kim.hashCode());
//		System.out.println("kildong hash=" + kildong.hashCode());
//		System.out.println(System.identityHashCode(kildong));
		
//		System.out.println(hong.equals(kim));
//		System.out.println(hong.equals(kildong));
//		System.out.println(ilsoo.equals(kim));
	}
	
}
