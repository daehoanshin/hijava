package hijava.basic;

import java.util.Objects;

public class Student implements Cloneable, Comparable<Student> {
	private int id;
	private String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	@Override
	public int hashCode() {
//		return Objects.hash(id, name);
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student(921234,"홍길동");
		System.out.println(s);
		
		Student s1 = new Student(123, "Hong");
		Student s2 = new Student(456, "Kim");
		Student s3 = new Student(123, "Hong");
		
		System.out.println("s1 equals s2 = " + s2.equals(s1)); //false
		System.out.println("s1 equals s3 = " + s3.equals(s1)); //true
		
		Student sa1 = new Student(921234, "홍길동");
		
		Student sa2 = (Student) sa1.clone();
	}
	@Override
	public int compareTo(Student o) {
		System.out.println("comp=" + this.id + "-" + o.id);
		return (this.id - o.id) * - 1;
	}
}
