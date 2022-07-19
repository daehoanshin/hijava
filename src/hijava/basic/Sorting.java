package hijava.basic;

import java.util.Comparator;

public class Sorting implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getId() - o2.getId();
	}
	
	public static void main(String[] args) {
		String s1 = "s100";
		String s2 = "s200";
		System.out.println(s1.compareTo(s2));
	}
	
	

}
