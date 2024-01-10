//left shifting array

public class Array6
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int left = 1;
		for(int i = 0;i<left;i++)
		{
			int temp = arr[0];
			int j = 0;
			for( ;j<arr.length-1;j++)
			{
				arr[j] = arr[j+1];
			}
			arr[j] = temp;
			System.out.println();
		}
		for (int i = 0;i<arr.length ;i++ ) 
		{
			System.out.println(arr[i]);	
		}
	}
}

