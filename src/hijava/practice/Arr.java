package hijava.practice;

public class Arr {
	public static void main(String[] args) {
//		ex1();
//		ex2();
//		ex3();
//		ex4();
//		ex5();
		ex6();
	}

	private static void ex6() {
		int upperStart = 65;
		int lowerStart = 97;
		
		int[] starts = new int[] { upperStart, lowerStart };
		char[][] arr = new char[2][26];
		
		for (int start=0; start < starts.length; start++) {
			for (int i = 0; i < 26; i++) {
				int x = i + starts[start];
//				System.out.println(x + "=" +(char)x);
				arr[start][i] = (char)x;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void ex5() {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		System.arraycopy(arr1, 0, arr2, 2, 3);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	private static void ex3() {
//		Man[] people = new Man[9];
//		int len = people.length;
	}

	private static void ex2() {
		String[] strs = new String[100];
		int len = strs.length;
		for (int i = 0; i < strs.length; i++) {
			strs[i] = "str" + (i + 1);
		}
		printArray(strs);
	}


	private static void ex1() {
		int[] nums = new int[100];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
		printArray(nums);
		
	}

	private static void printArray(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	private static void printArray(int[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
