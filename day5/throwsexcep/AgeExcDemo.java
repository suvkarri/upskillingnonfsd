package day5.throwsexcep;

import java.util.Scanner;

public class AgeExcDemo {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the age:");
		int age=sc.nextInt();
		try
		{
			if(age<15)
				throw new AgeException("Invalid age");
			else
				System.out.println("valid age");
			}
		catch(AgeException e)
		{
			System.out.println(e);
		}
	}
	}


