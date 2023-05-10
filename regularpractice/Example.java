package regularpractice;
class Be{
	public void baseMethod()
	{
		System.out.println("Base method will be called");
	}
}
class De extends Be{
	public void baseMethod()
	{
		System.out.println("Derived method will be called");
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Be ob=new De();
ob.baseMethod();
	}

}
