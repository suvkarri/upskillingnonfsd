package day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,i=1;
int n=10;
a=b=1;
System.out.print(a+" "+b);
while(i<n)
{
	c=a+b;
	System.out.print(" ");
	System.out.print(c);
	a=b;
	b=c;
	i++;
}



	}

}
