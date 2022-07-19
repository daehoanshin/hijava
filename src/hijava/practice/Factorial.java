package hijava.practice;

public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		System.out.println("result2=" + factorial(num ));
		
	}
	private static int factorial(int num) {
		System.out.println("factorial (" + num + ")");
		if (num <= 1) return 1;
		return num * factorial(num - 1);
	}
}
