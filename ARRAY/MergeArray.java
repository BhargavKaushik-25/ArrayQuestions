//merge two ascending array merge in ascending array

public class MergeArray
{
	public static void main(String[] args)
	{
		int[] arr1 = {1,3,5,7,9,11,13,15,17,19,21,23};
		int[] arr2 = {0,2,4,6,8,10,12,14,16,18,20,22};
		int[] arr3 = new int[arr1.length+arr2.length];

		int i = 0,j = 0,k = 0;
		
		for (;i<arr1.length && j<arr2.length ; ) 
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k++] = arr1[i];
				i++;
			}
			else 
			{
				arr3[k++] = arr2[j];
				j++;
			}	
		}
		if(arr1.length<arr2.length)
		{	
			for (;j<arr2.length ;j++ ) 
			{
				arr3[k++] = arr2[j];	
			}
		}
		else
		{
			for (;i<arr1.length ;i++ ) 
			{
				arr3[k++] = arr1[i];	
			}

		}


		for(int l = 0;l<arr3.length;l++)
		{
			System.out.print(arr3[l]+" ");
		}

		System.out.println("\nUSING WHILE LOOP\n");

		int i1 = 0,j1 = 0,k1 = 0;

		while (i1<arr1.length && j1<arr2.length  ) 
		{
			if(arr1[i1]<arr2[j1])
				{
					arr3[k1++] = arr1[i1];
					i1++;
				}
				else 
				{
					arr3[k1++] = arr2[j1];
					j1++;
				}	
		}
		if(arr1.length<arr2.length)
		{	
			while (j1<arr2.length  ) 
			{
				arr3[k1++] = arr2[j1];
				j1++;	
			}
		}
		else
		{
			while (i1<arr1.length ) 
			{
				arr3[k1++] = arr1[i1];
				i1++;	
			}

		}


		for(int l = 0;l<arr3.length;l++)
		{
			System.out.print(arr3[l]+" ");
		}
	}
}