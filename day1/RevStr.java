package day1;

import java.util.Scanner;

public class RevStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
p=sc.next();
for(int i=p.length();i>0;--i) {
	System.out.println(p.charAt(i-1));
}
	}

}
