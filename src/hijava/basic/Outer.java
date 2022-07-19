package hijava.basic;

public class Outer {
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void callIn() {
		Inner inner = new Inner();
		inner.in();
	}
	
	class Inner {
		public void in() {
			System.out.println("in inner class >> name=" + name);
		}
	}
	
	static class StaticInner {
		static String inStr = "Static inner inStr";
		public static void in() {
			System.out.println("static inner class >> name=" + inStr);
		}
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.setName("Hong");
		
		System.out.println("o.name=" + o.getName());
		o.callIn();
//		Inner inner = new Inner(); //fail !!(: outer가 먼저 생성되어야 함)
		StaticInner.in();
	}
	
}
