package regularpractice;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[3][4];

for(int i=0;i<3;i++)
{
    for(int j=0;j<4;j++)
    {
    	arr[i][j]= (int) (Math.random()*100);
	}
    
   
}
for(int i=0;i<3;i++)
{
    for(int j=0;j<4;j++)
    {
    	System.out.print(arr[i][j]+ " ");
	}
    System.out.println();
}

//Enhanced for loop

//for(int n[]:arr)
//{
//	for(int m:n)
//	{
//		System.out.print(m+" ");
//	}
//	System.out.println();
//}
}
}


