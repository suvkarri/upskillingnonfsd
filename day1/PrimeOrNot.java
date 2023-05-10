package day1;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
int a=2,count=0;
while(a<=n/2) {
	if(n%a==0) {
		count++;
		break;
	}
	a++;
}
if(count==0) {
	System.out.println(n+ "is a prime");
	
}
else {
	System.out.println(n+ " is not a prime");
}
	}

}
