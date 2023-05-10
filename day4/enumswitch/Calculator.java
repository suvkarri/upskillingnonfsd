package day4.enumswitch;

public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Operations operations;
operations=Operations.DIVISION;
switch(operations) {

case ADD:
	System.out.println("Adding");
	break;
case SUBSTRACT:
	System.out.println("Subtracting");
	break;
case MULTIPLY:
	System.out.println("Multiplying");
	break;
case DIVISION:
	System.out.println("dividing");
	break;
default:
	System.out.println("Not in the list provided");
	break;
		
}
	}

}
