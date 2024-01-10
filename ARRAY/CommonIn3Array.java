//find common in 3 array

public class CommonIn3Array
{
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,5,1,3,4};
		// int[] arr2 = {3,4,1,8,9};
		// int[] arr3 = {1,3,8,10,11};

		// for(int i = 0;i<arr1.length;i++)
		// {
		// 	for(int j = 0;j<arr2.length;j++)
		// 	{
		// 		for(int k = 0;k<arr3.length;k++)
		// 		{
		// 			if((arr1[i] == arr2[j])&&(arr1[i] == arr3[k]))
		// 			{
		// 				System.out.println(arr1[i]);
		// 			}
		// 		}
		// 	}
		// }
		int count = 0;

		for(int i = 0;i<arr1.length;i++)
		{
			for (int j = i+1;j<arr1.length ;j++ ) 
			{
				if (arr1[i] == arr1[j]) 
				{
					count++;		
				}	
			}
				
		}
		System.out.println(count);
	}
}