package day4.upcast;

class A{
	void print()
	{
		System.out.println("parent class");
}
}
	class B extends A{
		void print()
		{
			System.out.println("child class");
		}
	}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=(A)new B();
A obj1 =(A)new B();
obj.print();
obj1.print();
	}
}


