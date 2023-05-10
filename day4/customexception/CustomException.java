package day4.customexception;

import java.util.Scanner;

public class CustomException {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age:");
int age=sc.nextInt();
try
{
if(age<18)
	throw new InvalidAgeException("Invalid age");
else
	System.out.println("valid age");
}
catch(InvalidAgeException e)
{
System.out.println(e);
}
}
}

