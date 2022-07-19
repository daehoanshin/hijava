package hijava.practice;

public class Prime {
	public static void main(String[] args) {
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
//		int num = 4;
		for (int i = 2; i < 100; i++) {
			System.out.println("i: " + i + " " + isPrime(i));

		}

	}

	// 소수를 판별하라!
	private static boolean isPrime(int num) {
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

}
