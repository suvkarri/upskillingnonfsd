package regularpractice;

class AnonymousObject {
	
	public AnonymousObject()
	{
		System.out.println("Object created");
	}
public void show()
{
	System.out.println("in show");
}
public void display()
{
	System.out.println("in display");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AnonymousObject().show();
new AnonymousObject().display();

	}

}
