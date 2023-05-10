package day4.downcast;
class A{
	String name;
	public void message()
	{
		System.out.println("Display...");
	}
}
class B extends A{
	int age;
	public void message()
	{
		System.out.println("Displaying...");
	}
	public void show()
	{
		System.out.println("fghj");
	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=new B();
obj.name="Suvarna";
System.out.println(obj.name);
obj.message();
B b = (B)obj;
b.age=20;
System.out.println(b.name);
System.out.println(b.age);

	}

}
