package hijava.oop;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws SQLException, IOException {
		
//		netsport();
//		animal();
//		AbstSuper sp = new AbstChild();
//		int i = 5;
//		int j = 10;
//		
//		System.out.println("min=" + sp.min(i, j) + ", max=" + sp.max(i, j));
//		Weight guen = new Guen();
//		Weight pound = new Pound();
//		
//		int cnt = 5;
//		System.out.println("Guen=" + guen.getGram(cnt));
//		System.out.println("Pound=" + pound.getGram(cnt));
//		software();
//		calculator();
		
//		testinterface();
//		total();
//		calcoper();
		scanner();
	}

	private static void scanner() {
		System.out.println("문자열을 입력하세요>> ");
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.nextLine();
		System.out.println("Msg=" + msg);
		scanner.close();
	}

	private static void calcoper() {
		int x = 10, y = 5;
		CalcOper op = new CalcOper();
		
		int a = op.add(x, y);
		int s = op.sub(x, y);
		
		System.out.println(a + "," + s);
		op.mul(x, y);
		op.div(x, y);
	}

	private static void total() {
		int[] arr = new int[] {1, 2, 5, 9};
		SubTotal st = new SubTotal();
		System.out.println("Total=" + st.sum(arr));
	}

	private static void testinterface() throws SQLException, IOException {
		TestInterface ti = new TestImpl();
		ti.select("select  * from Table");
		TestInterface.out(1);
		
		Dog.eat("meat");
	}

	private static void calculator() {
		Calculator calc = new CalculatoerImple();
		int x = 10, y = 5;
		calc.add(x, y);
		calc.div(x, y);
		calc.sub(x, y);
	}

	private static void software() {
		SoftWare site = new WebSite();
		SoftWare app = new MobileApp();
		
		site.product();
		app.product();
	}

	private static void netsport() {
		NetSport pp = new PingPong();
		NetSport te = new Tennis();
		pp.play();
		System.out.println("-----------");
		te.play();
	}

	private static void animal() {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		barkAnimal(dog);
		barkAnimal(cat);
	}

	private static void barkAnimal(Animal ani) {
		ani.bark();
	}
}
