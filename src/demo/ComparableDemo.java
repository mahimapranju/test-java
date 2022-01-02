package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1,55));
		studs.add(new Student(2,95));
		studs.add(new Student(3,65));
		studs.add(new Student(4,98));
		studs.add(new Student(5,89));
		
		
		Collections.sort(studs);
		for(Student s : studs) {
			System.out.println(s);
		}
	}
}
class Student implements Comparable<Student>
{
	int rollno;
	int marks;
	
	public Student(int rollno, int marks) {
		this.rollno = rollno;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	public int compareTo(Student s) {
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
}
