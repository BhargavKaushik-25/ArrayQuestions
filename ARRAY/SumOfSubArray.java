//print the sub array whose sum is 9

public class SumOfSubArray
{
	public static void main(String[] args)
	{
		int[] arr = {-1,8,6,3,4,5,10};
		int sum = 9;

		int[][] arr1 = new int[3][2];
		int a1 = 0,a2 = 0;
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j]) == sum)
				{
					// for ( ;a1<arr1.length ;a1++ ) 
					// {

					// 	for ( ;a2<arr1.length ;a2++ ) 
					// 	{
					// 		arr1[a1][a2] = arr[i];

									
					// 	}	
					// }

					System.out.print(arr[i] + " " + arr[j]+",");
				}
			}
			System.out.println();
		}

		// for (int i = 0;i<arr1.length ;i++ ) 
		// {
		// 	for (int j = 0;j<arr1.length ;j++ ) 
		// 	{
		// 		System.out.print(arr1[i][j]);		
		// 		}	
		// }
	}
}