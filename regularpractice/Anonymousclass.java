package regularpractice;
class Base{
	void method(int a) {
		System.out.println("Base class method called with integer " +a);
	}
	void method(double d) {
		System.out.println("Base class method called with double "+d);
	}
	
}

class Derived extends Base
{
    @Override
	void method(double d)
	{
		System.out.println("Derived class method called with integer "+d);
	}
  
}
public class Anonymousclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Derived().method(19);

	}

}
