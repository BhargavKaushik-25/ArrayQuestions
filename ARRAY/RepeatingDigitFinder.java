//DELETE 3 FROM ARRAY

public class DeleteElement
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};

		for(int i = 0;i<arr.length-1;i++)
		{
			if(arr[i] >= 3)
			{
				arr[i] = arr[i+1];
			}
		}
		arr[arr.length-1] = 0;

		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}