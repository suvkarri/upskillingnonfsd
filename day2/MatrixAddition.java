package day2;

public class MatrixAddition {
public static void main(String args[]) {
	
	int a[][]= {{1,2,3},{2,3,4},{3,4,5}};
	System.out.println("1st matrix:");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
	System.out.print(a[i][j]+" ");
	}
		System.out.println();
	}
	
	int b[][]= {{3,4,5},{5,6,8},{7,8,9}};
	System.out.println("2nd matrix:");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("Matrix 1+Matrix 2");
	int array=3;
	int arr[][]=new int[array][array];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(a[i][j]+b[i][j]+" ");
		}
		System.out.println();
	}
}
}
	
	
	