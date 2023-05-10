package day1;

import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter a number:");
int a=s.nextInt();
if(a>0) {
	System.out.println(a+ " is a positive number");
}
else if(a==0)
{
	System.out.println(a+ "is a zero number");
}
else
{
	System.out.println(a+ "is a negative");
}
	}

}
