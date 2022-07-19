package hijava.practice;

public class Fonacci {
	public static void main(String[] args) {
		System.out.println(fibo(10));
		int num  = 5;
		
	}

	

	private static int fibo(int num) {
		if (num<=1) return num;

		return fibo(num - 1) + fibo(num - 2);
	}
}
 