package day3.constructor;

public class Person {


		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Person(String name, int age) {
		
			this.name = name;
			this.age = age;
		}
		public Person() {
		   name="Deepika";
		   age=21;
			// TODO Auto-generated constructor stub
		}
	 public static void main(String args[])
	 {
		 Person pc=new Person();
		System.out.println("Name:" +pc.getName());
		System.out.println("Age:"+pc.getAge());

		 Person pc1=new Person("Nagini",21);
		 System.out.println("Name:" +pc1.getName());
		 System.out.println("Age:" +pc1.getAge());
	 }
		
	}


