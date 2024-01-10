//union f two array

public class UnionArray
{
	public static void main(String[] args)
	{
		int[] A = {1,3,4,6,7,9};
		int[] B = {1,2,3,7,11};
		int temp1=0;

		// for(int i=0;i<arr1.length;i++)
		// {
		// 	int temp=temp1;
		// 	for(int j=0;j<arr2.length;j++)
		// 	{
		// 		if(!(arr1[i]==arr2[j]))
		// 		{
		// 			temp=arr1[i];
		// 		}
		// 		else {
		// 			temp=arr2[i];
		// 		}
		// 	}
		// 	System.out.println(temp1);
		// }
		// System.out.println(temp1);
		int i = 0,j = 0;
		for(;i<A.length&&j<B.length;)
		{
			if(A[i] < B[j])
			{
				System.out.print(A[i]+" ");
				i++;	
			}
			else if (B[j]<A[i])
			{
				System.out.print(B[j]+ " ");
				j++;
			}
			else
			{
				System.out.print(B[j] + " ");
				j++;
				i++;
			}
		
		}
		for( ;j<B.length;j++)
		{
			System.out.print(B[j]+" ");
		}
		for( ;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}