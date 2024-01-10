public class EqualArray
{
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,1,3};
		int[] arr3 = {1,1,3};

		EqualArray e1 = new EqualArray();
		boolean result = e1.checkArray(arr1,arr2,arr3);
		boolean result1 = e1.checkArray(arr1,arr2);
		boolean result2 = e1.checkArray(arr2,arr3);
		boolean result3 = e1.checkArray(arr1,arr3);
		if(result1)
		{
			if(result)
			{
				System.out.print("all array equal");
			}
			else{
				System.out.print("both array 1 and 2 array equal");
			}
		}
		else if (result2) 
		{
			System.out.print("array 2 and 3 are equal");
		}
		else if (result3) {
			System.out.print("array 1 and 3 are equal");
		}
		else {
			System.out.print("None of the array are equal");
		}
	}

	public boolean checkArray(int[] arr1, int[] arr2,int[] arr3)
	{
		if(arr1.length == arr2.length)
		{
			for(int i = 0;i<arr1.length;i++)
			{
				if(arr1[i] != arr2[i])
				{
					return false;
				}
			}
		}
		if(arr1.length == arr3.length)
		{
			for(int i = 0;i<arr1.length;i++)
			{
				if(arr1[i] != arr3[i])
				{
					return false;
				}
			}
		}
		if(arr2.length == arr3.length)
		{
			for(int i = 0;i<arr2.length;i++)
			{
				if(arr3[i] != arr2[i])
				{
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkArray(int[] arr1, int[] arr2)
	{
		if(arr1.length == arr2.length)
		{
			for(int i = 0;i<arr1.length;i++)
			{
				if(arr1[i] != arr2[i])
				{
					return false;
				}
			}
		}
		return true;
	}
}