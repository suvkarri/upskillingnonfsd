package day6.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}


	
	public int compareTo(Student that) {
		
		if(this.age>that.age)
		return 1;
		else
			return -1;
	}
	
	
}
public class Comparableee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student> studs=new ArrayList<>();
studs.add(new Student(21,"Ddfghjk"));
studs.add(new Student(20,"Ddrftgy"));
studs.add(new Student(19,"Sghjkih"));

Collections.sort(studs);
for(Student s:studs)
{
	System.out.println(s);
}
	}

}
