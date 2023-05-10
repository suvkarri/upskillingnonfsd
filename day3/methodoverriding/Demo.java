package day3.methodoverriding;

class A{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in config");
	}
}
	
	class B extends A{
	
		public void show()
		{
			System.out.println("in show B");
		}
	}

public class Demo {

	public static void main(String args[])
	{
		B b=new B();
		b.show();
		
	}
}
