package day2;

public class ReversingAnArray {
	
		 public static void main(String[] args) {
		 int arr[]= {2,5,7,1,3};
		 System.out.println("Original array:");
		 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");

		 }
System.out.println();
System.out.println("Reverse of an array:");
for(int i=arr.length-1;i>=0;i--)
{
	
	System.out.print(arr[i]+" ");
}
		 }
}

