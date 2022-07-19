package hijava.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Coll {
	public static void main(String[] args) {
//		lists();
//		sets();
//		treesets();
//		maps();
		
	}

	private static void maps() {
		Map<Integer, Student> map = new HashMap<>();
		Student s1 = new Student(100, "hong1");
		Student s2 = new Student(200, "hong2");
		Student s3 = new Student(300, "hong3");
		
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		System.out.println(map);
		
		int searchId = 301;
		if(map.containsKey(searchId)) {
			Student s200 = map.get(searchId);
			System.out.println(s200.getName());			
		} else {
			System.out.println(searchId + " 학생이 없습니다.!");
		}
	}

	private static void treesets() {
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student(100, "Hong"));
		set.add(new Student(50, "Lee"));
		set.add(new Student(200, "Kim"));
		set.add(new Student(100, "Hong"));
		System.out.println(set);
	}

	private static void sets() {
		Set<Student> set = new HashSet<>();
		set.add(new Student(100, "Hong"));
		set.add(new Student(50, "Lee"));
		set.add(new Student(200, "Kim"));
		set.add(new Student(100, "Hong"));
		System.out.println(set);
	}

	@SuppressWarnings("unused")
	private static void lists() {
		List<String> lst1 = new ArrayList<>();
		ArrayList<String> lst2 = new ArrayList<>();
		
		lst1.add("111");
		lst1.add("222");
		lst2.add("aaa");
		
		lst1.add(1, "100");
		System.out.println(lst1);
		System.out.println(lst2);
	}
}
