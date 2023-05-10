package day4.dividebyzero;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=53;
		try {
			int b=a/0;
			System.out.println(b);
		}
		catch(ArithmeticException e) {
			System.out.println("we can't divide a number with zero" +e);
		}
	}

	}

