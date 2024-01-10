//CHECK WHETHER ARRAYS ARE EQUAL OR NOT

public class ArrayEqual
{
	public static void main(String[] args)
	{
		int[] arr1 = {1,1,8};
		int[] arr2 = {1,1,8};
		int[] arr3 = {1,5,8};
		
		ArrayEqual a1 = new ArrayEqual();
		if(arr1.length == arr2.length)
		{
			if(arr1.length == arr3.length)
			{
				a1.checkEqual(arr1,arr3);
			}
			else
			{
				a1.checkEqual(arr1,arr2);
			}

		}
		
		if(arr3.length == arr2.length)
		{
			a1.checkEqual(arr2,arr3);
		}

	}

	void checkEqual(int[] array1,int[] array2)
	{
		boolean status = false;
		int i = 0,total = 0;
		for (;i<array1.length ;i++ ) 
		{
			if(array1[i] == array2[i])
			{
				status = true;
			}	
			else {
				status = false;
				break;
			}
		}
		if (status) 
		{
			System.out.println(" BOTH ARRAYS ARE EQUAL");	
		}
		else {
			System.out.println(" BOTH ARRAY ARE NOT EQUAL");
		}
	}
}