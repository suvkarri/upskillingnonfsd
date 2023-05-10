package day4.customexception;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String str)
	{
		super(str);
	}
}
