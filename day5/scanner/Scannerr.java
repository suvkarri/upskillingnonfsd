package day5.scanner;

import java.util.Scanner;

public class Scannerr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a number");
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();

if(num>=18)
System.out.println("Valid Age");
else
	System.out.println("Invalid Age");

	}

}

