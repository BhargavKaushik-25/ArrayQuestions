//putthe negative elemnet in the left side of the array


public class NegativeOnLeft
{
	public static void main(String[] args)
	{
		int[] arr = {-3,1,-2,4,-1,-5};
		int j = 0;
		//int i = 0;
		for(int i = 0 ;i<arr.length;i++)
		{
			int temp = arr[i];
			int temp1 = arr[j];
			if(arr[i]<0)
			{
				arr[j] = temp;
				arr[i] = temp1;
				j++;
			}
		}
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}



		System.out.println("\nSIR METHOD\n");

		int[] arr1 = {3,1,-2,4,-1,-5};

		for(int i = 0;i<arr1.length;i++ )
		{
			for(int k = i+1;k<arr1.length;k++)
			{
				if(arr1[i]>arr1[k])
				{
					int temp = arr1[i];
					arr1[i] = arr1[k];
					arr1[k] = temp;
				}
			}
		}

		for(int i = 0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
}