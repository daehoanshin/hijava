package hijava.oop;

public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("BowWow!");
	}
	
	public static void eat(String food) {
		System.out.println("Dog eat " + food);
	}

}
